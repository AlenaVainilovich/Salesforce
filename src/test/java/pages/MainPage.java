package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MainPage extends BasePage {

    public static final By BANNER = By.cssSelector(".oneTrialHeader");

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public boolean isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(BANNER));
        } catch (TimeoutException ex) {
            Assert.fail("Main Page is not opened");
        }
        return isPageOpened();
    }
}


