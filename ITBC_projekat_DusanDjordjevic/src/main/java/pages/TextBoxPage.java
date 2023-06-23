package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {
    //Elements

    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;

    private WebElement outputName;
    private WebElement outputEmail;
    private WebElement outputCurrentAddress;
    private WebElement outputPermanentAddress;


    public TextBoxPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }



    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.xpath("//input[@type='text']"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.xpath("//input[@type='email']"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        currentAddressField = getDriver().findElement(By.xpath("//textarea[@id='currentAddress']"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        permanentAddressField = getDriver().findElement(By.xpath("//textarea[@id='permanentAddress']"));
        return permanentAddressField;
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.xpath("//button[@id='submit']"));
        return submitButton;
    }

    public WebElement getOutputName(){
        outputName = getDriver().findElement(By.xpath("//p[@id='name']"));
        return outputName;
    }

    public WebElement getOutputEmail(){
        outputEmail = getDriver().findElement(By.xpath("//p[@id='email']"));
        return outputEmail;
    }
    public WebElement getOutputPermanentAddress(){
        outputPermanentAddress = getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));
        return outputPermanentAddress;
    }
    public WebElement getOutputCurrentAddress(){
        outputCurrentAddress=getDriver().findElement(By.xpath("//p[@id='currentAddress']"));
        return outputCurrentAddress;
    }


    public TextBoxPage enterValueInFullNameField(String name) {
        getFullNameField().sendKeys(name);
        return this;
    }
    public TextBoxPage enterValueInEmailField(String email) {
        getEmailField().sendKeys(email);
        return this;
    }
    public TextBoxPage enterValueInCurrentaAdressField(String Currentadress) {
        getCurrentAddressField().sendKeys(Currentadress);
        return this;
    }

    public TextBoxPage enterValueInPermanentAdressField(String PermanentAdress) {
        getPermanentAddressField().sendKeys(PermanentAdress);
        return this;
    }
    public TextBoxPage open() {
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }
    public TextBoxPage cliclSubmitButton() {
        getSubmitButton().click();
        return this;
    }
    public TextBoxPage scrool(int pixel) {
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }
    public TextBoxPage moveToElement(WebElement element) {
        getAction().moveToElement(element).perform();
        return this;
    }




}
