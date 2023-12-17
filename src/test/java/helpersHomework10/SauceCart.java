package helpersHomework10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceCart {

    WebDriver driver ;
    public SauceCart (WebDriver driver)
    {this.driver = driver ;}

    By checkout = By.id("checkout");
    By listProduct = By.xpath("//div[@class='inventory_item_name']");

    public void clickCheckout()  {
        driver.findElement(checkout).click();
    }

    public boolean isProductDisplayed () {
        return driver.findElement(listProduct).isDisplayed();
    }
}
