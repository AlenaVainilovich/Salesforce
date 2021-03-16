package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown extends BaseElement {

    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-picklist//input";
    String optionLocator = "//*[text()='%s']";

    public DropDown(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectDropDown(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        waitElementVisible(By.xpath(String.format(optionLocator, text)));
        driver.findElement(By.xpath(String.format(optionLocator, text))).click();
    }

}
