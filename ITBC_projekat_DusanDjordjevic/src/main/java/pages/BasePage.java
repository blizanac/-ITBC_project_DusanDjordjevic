package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //Elements
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;
    private Actions action;


    //Constructors
    public BasePage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions action) {
        this.driver = driver;
        this.wait = wait;
        this.js=js;
        this.action=action;

    }

    // Getters
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public JavascriptExecutor getJs(){
        return js;
    }
    public Actions getAction(){
        return action;
    }



}
