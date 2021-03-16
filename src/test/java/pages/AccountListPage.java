package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountListPage extends BasePage{

    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    public static final By ACCOUNT_NAME = By.xpath("//span[@title='Account Name']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }
    @Step("Open Account page")
    public void open() {
        driver.get("https://lwo2.lightning.force.com/lightning/o/Account/list?filterName=Recent");
    }
    @Step("Click 'New' button")
    public void clickNew() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void isAccountPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_NAME));
        } catch (TimeoutException ex) {
            Assert.fail("The page has not been loaded");
        }
    }

}
