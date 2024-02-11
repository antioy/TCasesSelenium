package pages;
import helpers.BrowserFactory;
import helpers.Hooks;
import org.junit.rules.Timeout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{


    public static WebDriver driver;



    WebDriverWait wait = new WebDriverWait(Hooks.driver, (10));

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]") private WebElement tShirtMenuButton;
    @FindBy(css = "a[class='product-name'][title='Faded Short Sleeve T-shirts']") private WebElement fadedTshirtButton;
    @FindBy(xpath = "//p[@id='add_to_cart']//span") private WebElement addToCartButton;
    @FindBy(id = "quantity_wanted") private WebElement quantity;
    @FindBy(id="group_1") private WebElement dropdownSize;
    @FindBy(id="color_14") private WebElement color;
    @FindBy(xpath ="//div[@class='fancybox-overlay fancybox-overlay-fixed']") private WebElement errorPopUp;
    //@FindBy(xpath = "//a[@class='fancybox-overlay fancybox-close']") private WebElement closeErrorMessage;
    @FindBy(xpath = "//div[@class='shopping_cart']//a[@title='View my shopping cart']") private WebElement shoppingCart;
    @FindBy(xpath = "//div[@class='shopping_cart']//a[@title='View my shopping cart']//span[1]") private WebElement totalCartQuantity;
    @FindBy(xpath = "//div[@class='shopping_cart']//a[@title='View my shopping cart']//span[2]") private WebElement productCart;
    @FindBy(xpath = "//div[@class='shopping_cart']//a[@title='View my shopping cart']//span[3]") private WebElement productsCart;

    public HomePage(BrowserFactory baseDriver) {
        super(baseDriver);
    }


    public WebElement getAddToCart() {
        return addToCartButton;
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clearQuantity() {
        quantity.clear();
    }

    public void setQuantity(String quantity) {
        this.quantity.sendKeys(quantity);
    }

    public void selectSizeFromDropdown(String size) {
        Select dropdown = new Select(dropdownSize);
        dropdown.selectByVisibleText(size);
    }

    public void selectColor() {
        color.click();
    }

    public void verifyErrorIsDisplayed() {
        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']")));
        //return errorPopUp.isDisplayed();
    }

    public void clickCloseErrorMessage() {
        //getDriver().switchTo().frame(errorPopUp);
        WebElement closeButton = errorPopUp.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']"));
        closeButton.click();
    }

    public void clickShoppingCart() {
        shoppingCart.click();
    }

    public WebElement getTotalCOuntQuantity() {
        return totalCartQuantity;
    }

    public WebElement getProductCart() {
        return productCart;
    }

    public WebElement getProductsCart() {
        return productsCart;
    }
}

