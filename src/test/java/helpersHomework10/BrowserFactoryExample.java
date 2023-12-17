package helpersHomework10;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactoryExample {

    public static WebDriver driver;

    public static WebDriver getDriver() {

        String browser = "edge";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Executing on Chrome");
            System.setProperty("webdriver.chrome.driver", "C:/Users/tsank/Downloads/driversChrome/chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");

        }
//        else if (browser.equalsIgnoreCase("Edge")) {
//            System.out.println("Executing on Edge");
//            WebDriverManager.chromedriver().setup();
//            driver = new  ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.get("https://www.saucedemo.com/");
//        }
            return driver;
        }

        public static void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }






