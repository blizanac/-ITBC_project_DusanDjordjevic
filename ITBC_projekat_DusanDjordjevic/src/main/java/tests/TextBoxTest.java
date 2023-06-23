package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TextBoxTest extends BaseTestPage {
    private String invalidMail = "petapericgmail.com";
    private String message = "Please include an '@' in the email address. 'petapericgmail.com' is missing an '@'.";

    @Test
    public void verifyOfFuncionalityTextBoxFormWithValidValue() {

        getTextBoxPage().open()
                .enterValueInFullNameField(getFaker().name().fullName())
                .enterValueInEmailField(getFaker().internet().emailAddress())
                .enterValueInCurrentaAdressField(getFaker().address().fullAddress())
                .enterValueInPermanentAdressField(getFaker().address().fullAddress())
                .scrool(300)
                .cliclSubmitButton();
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getTextBoxPage().getOutputName())).isDisplayed());
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getTextBoxPage().getOutputCurrentAddress())).isDisplayed());
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getTextBoxPage().getOutputPermanentAddress())).isDisplayed());
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getTextBoxPage().getOutputEmail())).isDisplayed());
    }

    @Test
    public void verifyOfFuncionalityTextBoxFormWithInvalidMail() {
        getTextBoxPage().open()
                .enterValueInFullNameField(getFaker().name().fullName())
                .enterValueInEmailField(invalidMail)
                .enterValueInCurrentaAdressField(getFaker().address().fullAddress())
                .enterValueInPermanentAdressField(getFaker().address().fullAddress())
                .scrool(300)
                .cliclSubmitButton()
                .moveToElement(getTextBoxPage().getEmailField());
        Assert.assertEquals(getTextBoxPage().getEmailField().getAttribute("validationMessage"),message);

    }
}
