package pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContactListPage extends BasePage {

    public static final By NEW_BUTTON = By.cssSelector("div[title='New']");
    private static final By CONTACTS_IMAGE = By.cssSelector("img[title='Contacts']");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening contact list")
    public void open() {
        driver.get("https://lwo2.lightning.force.com/lightning/o/Contact/new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
    }

    @Step("Click 'New'")
    public void clickNew() {
        driver.findElement(NEW_BUTTON);
    }

    @Step("Check that Contact page was opened")
    public void isContactPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(CONTACTS_IMAGE));
        } catch (TimeoutException ex) {
            Assert.fail("Contact's page do not open ");
        }
    }
}
