package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class BrowserFactory {
    private static Map<String, WebDriver> drivers = new HashMap<>();

    public static WebDriver getBrowser(String browserName) {

        WebDriver driver = null;

        switch (browserName) {
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver", "C:/Users/tsank/Downloads/driversChrome/chromedriver.exe");

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }

    public static void closeDrivers() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
        }
    }
}

    


