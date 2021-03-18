package pages;

import elements.DropDown;
import elements.Input;
import elements.LookUp;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage{
    private static final By SAVE_BUTTON=By.cssSelector("[title=Save]");


    public NewContactModal(WebDriver driver) {

        super(driver);
    }

    @Step ("Create new contact")
    public void createNewContact(Contact contact) {
        new DropDown(driver, "Salutation").selectDropDown(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new LookUp(driver, "Account Name").select(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new LookUp(driver, "Reports To").select(contact.getReportsTo());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new TextArea(driver, "Mailing Street").writeText(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State").write(contact.getMailingState());
        new Input(driver, "Postal Code").write(contact.getPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());

    }

    @Step("Click 'Save'")
    public void clickSave() {
        driver.findElement(SAVE_BUTTON).click();
    }

}
