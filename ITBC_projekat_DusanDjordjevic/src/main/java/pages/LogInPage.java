package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement logInButton;
    private WebElement errorMessage;


    public LogInPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }


    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.xpath("//input[@id='userName']"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.xpath("//input[@id='password']"));
        return passwordField;
    }
    public WebElement getLogInButton () {
        logInButton=getDriver().findElement(By.xpath("//button[@id='login']"));
        return logInButton;
    }
    public WebElement getErrorMessage(){
        errorMessage = getDriver().findElement(By.id("name"));
        return errorMessage;
    }

    //Methods
    public LogInPage open() {
        getDriver().get("https://demoqa.com/login");
        return this;
    }

    public LogInPage enterUserName(String name) {
        getUserNameField().sendKeys(name);
        return this;
    }

    public LogInPage enterPassword(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }
    public LogInPage clickButtonLogInButton(){
        getLogInButton().click();
        return this;
    }

public LogInPage waiterForProfileUrl(){
        getWait().until(ExpectedConditions.urlContains("https://demoqa.com/profile"));
        return this;
}
public LogInPage waitForElement(String id){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        return this;
}




}
