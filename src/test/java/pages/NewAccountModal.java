package pages;

import elements.DropDown;
import elements.Input;
import elements.LookUp;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BasePage{
    public static final By SAVE = By.xpath("//*[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }
    @Step("Creating account: {}")
    public void createAccount(Account account) {
        new LookUp(driver, "Account Name").select(account.getAccountName());
        new LookUp(driver, "Parent Account").select(account.getParentAccount());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown(driver, "Type").selectDropDown(account.getType());
        new DropDown(driver, "Industry").selectDropDown(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new TextArea(driver, "Description").writeText(account.getDescription());
        new TextArea(driver, "Billing Street").writeText(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State").write(account.getBillingState());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new TextArea(driver, "Shipping Street").writeText(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
    }

    public void save() {
        driver.findElement(SAVE).click();
    }

}
