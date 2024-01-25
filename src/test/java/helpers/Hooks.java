package helpers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class Hooks extends  BrowserFactory{
     public static void beforeTesting(){
         WebDriver driver = getBrowser("Crome");
         driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
     }

    @After
    public  static void quitDriver() {
        quitDriver();

    }
}
