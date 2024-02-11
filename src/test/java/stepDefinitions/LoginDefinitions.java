package stepDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import java.sql.Driver;
import java.util.List;
import java.util.Map;
import helpers.BrowserFactory;




import static helpers.Hooks.driver;

public class LoginDefinitions {


    HomePage homePage;
    LoginPage loginPage;


    @Given("a user is on the {string} page")
    public void aUserIsOnThePage(String url) {
        loginPage.navigateToUrl(url);
    }
    @When("user input valid username and password")
    public void user_input_valid_username() throws Exception {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(500);
    }
    @And("user click button Login")
    public void user_click_button_login() throws Exception {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);
    }
    @Then("home page should be displayed")
    public void home_page_should_be_displayed() {
        Assert.assertEquals("Products",driver.findElement(By.className("title")).getText());
        System.out.println("Scenario : Login as valid username");
        System.out.println("If Success Login, You Can See Title Name " + driver.findElement(By.className("title")).getText());
        driver.quit();
    }
}

