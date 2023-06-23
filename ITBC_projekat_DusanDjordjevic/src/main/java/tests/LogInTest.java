package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTestPage {

    private String validUserName = "PeraPeric1";
    private String validPassword = "Pera,peric2@";
    private String invalidUsername = "peraPeric";
    private String invalidPassword = "peraPeric";
    private String errorMessage = "Invalid username or password!";
    private String ErrorMessageId = "name";


    @Test
    public void verifyLogInWithValidParametars() {
        getLogInPage().open()
                .enterUserName(validUserName)
                .enterPassword(validPassword)
                .clickButtonLogInButton()
                .waiterForProfileUrl();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/profile"));
    }

    @Test
    public void verifyLogInWithInvalidParametars() {
        getLogInPage().open()
                .enterUserName(invalidUsername)
                .enterPassword(invalidPassword)
                .clickButtonLogInButton()
                .waitForElement(ErrorMessageId);
        Assert.assertTrue(getLogInPage().getErrorMessage().isDisplayed());
        Assert.assertEquals(getLogInPage().getErrorMessage().getText(), errorMessage);
    }

    @Test
    public void verifyLogInWithInvalidUserName(){
        getLogInPage().open()
                .enterUserName(invalidUsername)
                .enterPassword(validPassword)
                .clickButtonLogInButton()
                .waitForElement(ErrorMessageId);
        Assert.assertTrue(getLogInPage().getErrorMessage().isDisplayed());
        Assert.assertEquals(getLogInPage().getErrorMessage().getText(), errorMessage);
    }

}
