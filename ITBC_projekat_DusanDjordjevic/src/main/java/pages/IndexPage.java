package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {
    //Elements
    private WebElement elementField;


    public IndexPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait,js,action);
    }


    public WebElement getElementField(){
        elementField = getDriver().findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        return elementField;
    }



    public IndexPage open(){
        getDriver().get("https://demoqa.com/");
        return this;
    }

    public IndexPage clickElementField(){
        getElementField().click();
        return this;
    }

    public IndexPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }


}
