package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {

    //Elements
    private WebElement checkBoxElement;
    private WebElement resultField;

    public CheckBoxPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }




    //Getters
    public WebElement getCheckBoxElement(){
        checkBoxElement = getDriver().findElement(By.xpath("//span[@class='rct-checkbox']"));
        return  checkBoxElement;
    }
    public WebElement getResultField(){
        resultField = getDriver().findElement(By.xpath("//div[@id='result']"));
        return resultField;
    }


    //Methods
    public CheckBoxPage selectCheckBoxMethod(){
       getCheckBoxElement().click();
        return this;
    }

    public CheckBoxPage open (){
        getDriver().get("https://demoqa.com/checkbox");
        return this;
    }
}
