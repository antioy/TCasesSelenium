package homeworkPageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static WebDriver driver;
    private static HomePage homePage;

    static By buttonCards = By.id("header_Menu1_ctl01_Cards");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public static HomePage getInstance(WebDriver driver) {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public static void clickOnTheCardsButton(){
        driver.findElement(buttonCards).click();
    }

    public static String getTitleOfPage(){
        return driver.getTitle();
    }
}