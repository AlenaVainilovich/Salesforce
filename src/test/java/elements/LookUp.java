package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LookUp extends BaseElement{
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-lookup//input";
    String optionLocator = "//*[@title='%s']";


    public LookUp (WebDriver driver, String label) {
        super(driver, label);
    }

    public void select (String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(optionLocator, text))));

        } catch (NoSuchElementException ex) {
            Assert.fail(String.format("Cannot find option '%s'"));
        }
        driver.findElement(By.xpath(String.format(optionLocator, text))).click();
    }
}
