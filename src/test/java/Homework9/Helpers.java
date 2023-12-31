package Homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class Helpers {
    protected WebDriver driver;


    @Before
    public void setDriver() {

        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Executing on Chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://demoqa.com/text-box");


        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Executing on Firefox");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");
        }


    }

    @After
    public void teardown() {

        driver.quit();
    }
}
