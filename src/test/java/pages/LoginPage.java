package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{
    public static final By USERNAME = By.id("username");
    public static final By LOGIN = By.id("Login");
    public static final By PASSWORD = By.id("password");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    @Step ("Opening login page")
    public void openLoginPage(){
        driver.get(URL);
        isLoginPageOpen();
    }

    @Step("Login by user {username}")
    public void login(String userName, String password) {
        driver.findElement(USERNAME).sendKeys(userName);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN).click();
    }

    @Step("Validate that Login Page was opened")
    public LoginPage isLoginPageOpen() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LOGIN));
        return this;
    }
}
