package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElement {

    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-input//input";

    public Input (WebDriver driver, String label) {
        super(driver, label);

    }

    public void write (String text) {
        waitElementVisible(By.xpath(String.format(locator, label)));
        driver.findElement(By.xpath(String.format(locator, label))).clear();
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);

    }
}
