package helpers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Hooks extends  BrowserFactory{
    private WebDriverWait wait;
    @Before
    public void setUp() {
        BrowserFactory.getDriver();
    }

    @After
    public void tearDown() {
        BrowserFactory.quitDriver();

    }
}
