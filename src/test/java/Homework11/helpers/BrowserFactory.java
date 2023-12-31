package Homework11.helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        String browser = "chrome";

        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Executing on Chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");

        } else if (browser.equalsIgnoreCase("Edge")) {
            System.out.println("Executing on Edge");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");

        }

        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
