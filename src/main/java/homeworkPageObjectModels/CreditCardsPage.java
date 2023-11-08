package homeworkPageObjectModels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditCardsPage {

    private static WebDriver driver;
    private static CreditCardsPage creditCardsPage;

    By dropdownMenuForTypesOffers = By.xpath("(//span[@class='selecter-selected'])");


    public CreditCardsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static CreditCardsPage getInstance(WebDriver driver) {
        if (creditCardsPage == null) {
            creditCardsPage = new CreditCardsPage(driver);
        }
        return creditCardsPage;
    }

}