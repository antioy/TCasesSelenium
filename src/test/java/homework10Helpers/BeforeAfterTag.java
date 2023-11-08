package homework10Helpers;

import org.junit.After;
import org.junit.Before;

public class BeforeAfterTag {



    @Before
    public void loadBrowser() {
        System.out.println("---------Before Tag--------");
    }


    @After
    public void closeBrowsers() {
        System.out.println("---------Close Tag--------");
        BrowserFactory.closeAllDrivers();
    }
}


