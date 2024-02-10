package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

import java.util.concurrent.TimeUnit;
public class BrowserFactory {

    public static WebDriver driver;


    public static WebDriver getBrowser(String browserType) {

        switch (browserType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();


                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    return new ChromeDriver(options);

                 default:
                  throw new IllegalArgumentException("Unsupported browser type: " + browserType);
       }
    }
 }

    


