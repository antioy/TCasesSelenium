package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;

    @Given ("I use credentials {string} and {string}")
    public void iUseCredentials(String username, String password) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/tsank/Downloads/driversChrome/chromedriver.exe");
        driver = new ChromeDriver();

        WebElement usernameInput = driver.findElement(By.cssSelector("#user-name"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        passwordInput.sendKeys(password);
    }
}

