package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import models.Contact;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

@Listeners(TestListener.class)
public class ContactTest extends BaseTest {

    @Test(description = "Create new 'Contact'")
    @Description("New 'Contact' will be create")
    @Link("https://www.salesforce.com/")
    @Issue("author Alena Vainilovich")

    public void createContact() {
        loginSteps.login(login, password);
        Contact contact = new Contact("Ms.", "Helena", "Carter", "Bonem", "crazy", "LWO LLC", "NA", "contact@lwo.by", "3281400", "Vitebsk", "Helena Bonem Cartier", "QA", "666", "Kropotkina", "Minsk", "Belarus", "220020", "Belarus");
        contactSteps.createNewContact(contact);
    }
}