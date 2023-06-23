package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import java.time.Duration;

public class BaseTestPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBox;
    private ButtonsPage buttonsPage;
    private LogInPage logInPage;
    private RegisterPage registerPage;
    private DropplablePage dropplablePage;
    private AlertsPage alertsPage;
    private JavascriptExecutor js;
    private Actions action;
    private Faker faker;




    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public CheckBoxPage getCheckBox() {
        return checkBox;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public LogInPage getLogInPage() {
        return logInPage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public DropplablePage getDropplablePage() {
        return dropplablePage;
    }
    public AlertsPage getAlertsPage(){return alertsPage;}

    public JavascriptExecutor getJs() {
        return js;
    }

    public Actions getAction() {
        return action;
    }

    public Faker getFaker() {
        return faker;
    }




    @BeforeClass
    public void setUp() {
        System.getProperty("webdriver.chromedriver.driver", "C://Users//djord//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
        faker = new Faker();
        action = new Actions(driver);
        indexPage = new IndexPage(driver, wait, js, action);
        elementsPage = new ElementsPage(driver, wait, js, action);
        textBoxPage = new TextBoxPage(driver, wait, js, action);
        checkBox = new CheckBoxPage(driver, wait, js, action);
        buttonsPage = new ButtonsPage(driver, wait, js, action);
        logInPage = new LogInPage(driver, wait, js, action);
        registerPage = new RegisterPage(driver, wait, js, action);
        dropplablePage = new DropplablePage(driver, wait, js, action);
        alertsPage = new AlertsPage(driver,wait,js,action);


    }

    @BeforeMethod
    public void beforeAnyMethod() {
        getDriver().manage().window().maximize();
    }

    @AfterClass
    public void close(){
        getDriver().close();
    }


}
