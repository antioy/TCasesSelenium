package Homework11.Tests;

import Homework11.PageObjectModels.SauceDemoT;
import Homework11.helpers.Hooks;
import Homework9.HomePage;
import Homework9.LoginPageTests;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SauceDemoTests extends Hooks {
    SauceDemoT loginBoxPage;

    @Test
    public void enterUsername(String name) throws InterruptedException {
        LoginPageTests login1 = new LoginPageTests(driver);
        login1.loginTest("standard_user", "secret_sauce");
        login1.wait(3600);




    }

}
