package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {

    private WebElement textBoxField;


    public ElementsPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }


    public WebElement getTextBoxField() {
        textBoxField = getDriver().findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        return textBoxField;
    }


    public ElementsPage clickElementMethod(WebElement element) {
        getAction().click(element);
        return this;
    }



}
