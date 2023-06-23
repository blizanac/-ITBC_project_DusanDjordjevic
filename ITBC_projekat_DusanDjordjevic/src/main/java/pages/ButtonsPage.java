package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    //Elements
    private WebElement doubleClickMeButton;
    private WebElement rightClickButton;
    private WebElement clickMeButton;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement oneClickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action );
    }

    //Constructors


    //Gedtters
    public WebElement getDoubleClickMeButton(){
        doubleClickMeButton = getDriver().findElement(By.xpath("//button[@id='doubleClickBtn']"));
        return doubleClickMeButton;
    }

    public WebElement getRightClickButton(){
        rightClickButton = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        return rightClickButton;
    }

    public WebElement getClickMeButton(){
        clickMeButton = getDriver().findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[position()=2]" +
                "/div[position()=3]/button[@type='button']"));
        return clickMeButton;
    }
    public WebElement getDoubleClickMessage(){
        doubleClickMessage=getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMessage;
    }
    public WebElement getRightClickMessage(){
        rightClickMessage = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }
  public  WebElement getOneClickMessage(){
        oneClickMessage = getDriver().findElement(By.xpath("//p[@id='dynamicClickMessage']"));
        return oneClickMessage;
  }

    //Methods
    public  ButtonsPage open (){
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }

    public  ButtonsPage doubleClick(WebElement element){
        getAction().doubleClick(element).perform();
        return this;
    }

    public ButtonsPage rightClick (WebElement element){
        getAction().contextClick(element).perform();
        return this;
    }
    public ButtonsPage oneClick (WebElement element){
      getAction().click(element).perform();
        return this;
    }
    public ButtonsPage waitMessage(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
        return this;
    }

}
