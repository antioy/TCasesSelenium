package pages;
import helpers.Hooks;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    WebDriverWait wait = new WebDriverWait(Hooks.driver, (10));

    @FindBy(className = "bm-burger-button")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logout;
    @FindBy(id = "item_1_title_link")
    WebElement SauseLabBolt;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartSauceLabsBoltButton;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartHome;
    @FindBy(className = "shopping_cart_badge")
    WebElement quantityOfProductsInCart;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartSauceLabsBackpack;

    public HomePage(WebDriver driver) {
    }

    public boolean verifyMenuButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("bm-burger-button")));
        return menuButton.isDisplayed();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public boolean verifyLogoutButtonIsDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
        return logout.isDisplayed();
    }

    public void clickLogout() {
        logout.click();
    }

    public void logout() {
        clickMenuButton();
        verifyLogoutButtonIsDisplayed();
        clickLogout();


    }

    public void clickSauseLabsBolt() {
        SauseLabBolt.click();
    }



    public void clickAddToCartSauceLabsBoltButton() {
        addToCartSauceLabsBoltButton.click();
    }
  }


