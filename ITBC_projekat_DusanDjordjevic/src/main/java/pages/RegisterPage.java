package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage extends BasePage {
    //Elements
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement registerButton;
    private WebElement errorMessageChaptcha;



    public RegisterPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }


    public WebElement getFirstNameField() {
        firstNameField = getDriver().findElement(By.xpath("//input[@id='firstname']"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField = getDriver().findElement(By.xpath("//input[@id='lastname']"));
        return lastNameField;
    }

    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.xpath("//input[@id='userName']"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.xpath("//input[@id='password']"));
        return passwordField;
    }


    public WebElement getRegisterButton() {
        registerButton = getDriver().findElement(By.xpath("//button[@id='register']"));
        return registerButton;
    }
    public WebElement getErrorMessageChaptcha(){
        errorMessageChaptcha = getDriver().findElement(By.id("output"));
        return errorMessageChaptcha;
    }


    public RegisterPage open() {
        getDriver().get("https://demoqa.com/register");
        return this;
    }
    public RegisterPage enterFirstNameForRegistration(String name) {
        getFirstNameField().sendKeys(name);
        return this;
    }

    public RegisterPage enterLastNameForRegistration(String lastName) {
        getLastNameField().sendKeys(lastName);
        return this;
    }

    public RegisterPage enterUserNameForRegistration(String userName) {
        getUserNameField().sendKeys(userName);
        return this;
    }

    public RegisterPage enterPasswordForRegistration(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }

    public RegisterPage clickRegisterButton() {
        getRegisterButton().click();
        return this;
    }
    public RegisterPage scroll(int pixel) {
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

}
