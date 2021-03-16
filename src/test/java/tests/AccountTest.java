package tests;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{

    @Test(description = "Create new 'Contact'")
    public void createAccount(){
        loginSteps.login(login, password);
        Account account = new Account("Arsenal", "Customer", "https://arsenal-bl.com/", "Military shop",
                "LWO LLC", "+375449874062", "Technology", "Jack",
                "Big", "Kadtmandu", "USA", "220020",
                "qwe", "asd", "Kuala Lumpur", "Kva", "220090",
                "USA");
        accountSteps.create(account);
    }
}
