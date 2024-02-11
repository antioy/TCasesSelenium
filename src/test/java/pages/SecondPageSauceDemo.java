package pages;

import helpers.BrowserFactory;
import helpers.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageSauceDemo extends BasePage {
    public static WebDriver webDriver;

    WebDriverWait wait = new WebDriverWait(Hooks.driver, (10));
    public SecondPageSauceDemo(BrowserFactory baseDriver) {
        super(baseDriver);
    }

    @FindBy(xpath = "//td[@class='cart_description']//p[@class='product-name']//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    private WebElement orderedItem;

    @FindBy(xpath = "//td[@class='cart_description']//small//a") private WebElement itemProperties;

    @FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']") private WebElement orderedQuantity;



    public WebElement getOrderedItem() {
        return orderedItem;
    }

    public WebElement getItemProperties() {
        return itemProperties;
    }

    public WebElement getOrderedQuantity() {
        return orderedQuantity;
    }

}