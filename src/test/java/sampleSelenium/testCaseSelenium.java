package sampleSelenium;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSelenium {

    public static WebDriver driver;
    static String path = System.getProperty("user.dir");

    public static void main(String[] args) {
        @BeforeTest
        public void SetDriver(){
        System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        // Chrome is Version 118.0.5993.71 (Official Build) (64-bit)
        driver.manage().window().maximize();

        @Test
        public void verifyTitle() {
         WebDriver browser;
            browser.get("https://www.moitepari.bg/");

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "MoitePari.bg - nad 1000 finansovi produkta na edno mqsto"
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Assert passed");
        }


        @AfterTest
        public void closedriver(){
    //closes the browser instance
        driver.close();
    }
}
