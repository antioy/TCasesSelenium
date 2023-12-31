package helpersHomework10;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class BrowserFactoryExample {

    public static Webdriver driver;
    public void BrowserFactory(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver getBrowser(String browserType) {
        WebDriver driver = null;

        switch (browserType) {

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/Users/tsank/Downloads/driversChrome/chromedriver.exe");
                return driver = new ChromeDriver();

            case "edge":

                System.setProperty("webdriver.edge.driver", "C:/Users/tsank/Downloads/driversEdge/msedgedriver.exe");
                return driver = new EdgeDriver();

            public static void quitDriver();
                if (driver != null) {
                    driver.quit();
                    driver = null;
                }

        }


    }


