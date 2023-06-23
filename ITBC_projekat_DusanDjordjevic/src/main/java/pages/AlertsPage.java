package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{
    //Elements
    private WebElement alertButton;
    private WebElement timerButton;
    private WebElement confirmButton;
    private WebElement promtButton;
    private WebElement ConfirmMessageButton;
    private WebElement PromptMessageButton;


    public AlertsPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }


    public WebElement getAlertButton(){
        alertButton=getDriver().findElement(By.id("alertButton"));
        return alertButton;
    }

    public WebElement getTimerButton(){
        timerButton =getDriver().findElement(By.id("timerAlertButton"));
        return timerButton;
    }
    public WebElement getConfirmButton(){
        confirmButton=getDriver().findElement(By.id("confirmButton"));
        return confirmButton;
    }

    public WebElement getPromtButton(){
        promtButton=getDriver().findElement(By.id("promtButton"));
        return promtButton;
    }
    public WebElement getConfirmMessageButton(){
        confirmButton=getDriver().findElement(By.id("//div[@class='col-md-6']/span[position()=2]"));
        return ConfirmMessageButton;
    }

    public WebElement getPromptMessageButton(){
        promtButton = getDriver().findElement(By.id("promptResult"));
        return promtButton;
    }


    public AlertsPage open(){
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }

    public AlertsPage clickElementMethod(WebElement element){
        getAction().click(element).perform();
        return this;
    }
    public AlertsPage scroolPageMethod(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public  AlertsPage switchAlertWindow(){
        getDriver().switchTo().alert();
        return this;
    }
    public AlertsPage acceptAlertMessage(){
        getDriver().switchTo().alert().accept();
        return this;
    }
    public AlertsPage takeTextAlert(){
     getDriver().switchTo().alert().getText();
        return this;
    }

    public AlertsPage sendText(String text){
        getDriver().switchTo().alert().sendKeys(text);
        return this;
    }

    public AlertsPage waitForAlert(){
        getWait().until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public AlertsPage waitForVisibilityOfElement(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        return this;
    }


}
