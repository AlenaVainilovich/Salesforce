package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends BaseElement {
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-textarea//textarea";

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    public void writeText(String text) {
        waitElementVisible(By.xpath(String.format(locator, label)));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }
}
