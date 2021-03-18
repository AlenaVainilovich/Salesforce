package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.AccountSteps;
import steps.ContactSteps;
import steps.LoginSteps;
import utils.TestListener;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    LoginSteps loginSteps;
    ContactSteps contactSteps;
    AccountSteps accountSteps;

    public final static String login = "";
    public final static String password = "";

    @BeforeMethod (description = "Opening browser")
    public void setup(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String variable = "driver";
        System.out.println("Setting driver into context with variable name " + variable);
        context.setAttribute(variable, driver);
        loginSteps = new LoginSteps(driver);
        contactSteps = new ContactSteps(driver);
        accountSteps = new AccountSteps(driver);
    }

    @AfterMethod (alwaysRun = true, description = "Closing browser")
    public void closeBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }

}
