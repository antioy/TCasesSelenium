
import helpersHomework10.BrowserFactoryExample;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BrowserFactoryExample {

    @Before
    public void setUp() {
        BrowserFactoryExample.getDriver();

    }

    @After
    public void tearDown() {
        BrowserFactoryExample.quitDriver();
    }
}