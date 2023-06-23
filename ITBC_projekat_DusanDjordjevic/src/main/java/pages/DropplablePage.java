package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropplablePage extends BasePage {
    //Elements
    private WebElement dragMeBox;
    private WebElement dropMeBox;
    private WebElement acceptTabButton;
    private WebElement acceptabileDragBox;
    private WebElement notAcceptabileDragBox;
    private WebElement acceptabileDropBox;

    //Constructor
    public DropplablePage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        super(driver, wait, js, action);
    }

    //Getters
    public WebElement getDragMeBox() {
        dragMeBox = getDriver().findElement(By.xpath("//div[@id='draggable']"));
        return dragMeBox;
    }

    public WebElement getDropMeBox() {
        dropMeBox = getDriver().findElement(By.xpath("//div[@id='simpleDropContainer']/div[position()=2]"));
        return dropMeBox;
    }

    public WebElement getAcceptTabButton() {
        acceptTabButton = getDriver().findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
        return acceptTabButton;
    }

    public WebElement getAcceptabileDragBox() {
        acceptabileDragBox = getDriver().findElement(By.xpath("//div[@id='acceptable']"));
        return acceptabileDragBox;
    }

    public WebElement getNotAcceptabileDragBox() {
        notAcceptabileDragBox = getDriver().findElement(By.xpath("//div[@id='notAcceptable']"));
        return notAcceptabileDragBox;
    }

    public WebElement getAcceptabileDropBox() {
        acceptabileDropBox = getDriver().findElement(By.xpath("//div[@class='accept-drop-container']/div[position()=2]"));
        return acceptabileDropBox;
    }




    //Methods

    public DropplablePage open() {
        getDriver().get("https://demoqa.com/droppable");
        return this;
    }

    public DropplablePage dragAndDropMethod(WebElement element1, WebElement element2) {
        getAction().dragAndDrop(element1, element2).perform();
        return this;
    }
    public DropplablePage clickWebElement(WebElement element) {
        getAction().click(element).perform();
        return this;
    }

}
