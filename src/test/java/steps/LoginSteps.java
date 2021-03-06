package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.MainPage;

import static org.testng.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;


    public LoginSteps(WebDriver driver){

        this.driver = driver;
    }

    @Step("Login with {username} and {password}")
    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login(username, password);
        assertTrue(new MainPage(driver).isPageOpened(), "Main page was nao opened");
    }


}
