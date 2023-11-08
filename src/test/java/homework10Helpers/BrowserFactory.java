package homework10Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;
        switch (browserName) {
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsank\\IntelliJ IDEA Community Edition 2023.1.2\\TCasesSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                }
                break;


            case "Edge":
                driver = drivers.get("IE");
                if (driver == null) {
                    System.setProperty("webdriver.edge.driver","C:\\Users\\tsank\\IntelliJ IDEA Community Edition 2023.1.2\\TCasesSelenium\\src\\test\\resources\\drivers\\msedgedriver.exe");

                    EdgeOptions options = new EdgeOptions();
                    options.wait("--remote-allow-origins=*");
                    driver = new EdgeDriver(options);
                    drivers.put("Edge", driver);
                }
                break;
        }
        return driver;
    }

    public static void closeAllDrivers() {
        System.out.println("*********** Close method ***********");
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
        }
    }
}
