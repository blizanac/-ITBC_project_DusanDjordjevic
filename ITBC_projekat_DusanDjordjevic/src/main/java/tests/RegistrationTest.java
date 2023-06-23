package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTestPage{



    @Test
    public void verifyRegistrationWithotSelectChaptcha(){
getRegisterPage().open()
        .enterFirstNameForRegistration(getFaker().name().firstName())
        .enterLastNameForRegistration(getFaker().name().lastName())
        .enterUserNameForRegistration(getFaker().name().nameWithMiddle())
        .enterPasswordForRegistration(getFaker().internet().password())
        .scroll(400)
        .clickRegisterButton();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getRegisterPage().getErrorMessageChaptcha())).isDisplayed());
    }


}
