package homeworkPageObjectModels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CardsPage {
    private static WebDriver driver;
    private static CardsPage cardsPage;

    static By compareButtonOnDebitCards = By.xpath("(//a[@class='rounded-btn'])[2]");

    public CardsPage(WebDriver driver){
        this.driver = driver;
    }

    public static CardsPage getInstance(WebDriver driver){
        if(cardsPage == null){
            cardsPage = new CardsPage(driver);
        }
        return cardsPage;
    }

    public void clickOnCompareButton(){

        driver.findElement(compareButtonOnDebitCards).click();
    }
}
