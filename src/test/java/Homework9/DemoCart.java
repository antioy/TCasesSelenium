package Homework9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoCart {

    @FindBy(className = "cart_checkout_link")
    private WebElement checkoutLink;

    public static String CARTPAGE_URL = "https://www.saucedemo.com/cart.html";

    public WebDriver driver;


    public DemoCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmCheckout() {
        checkoutLink.click();
    }

}

