package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest{

    @Test(description = "Log in to the 'SalesForce'")
    @Description("Username and Password correct data, check that validation was correctly ")
    @Link("https://lwo2.my.salesforce.com/")

    public void login() {
       loginSteps.login(login, password);
    }
}
