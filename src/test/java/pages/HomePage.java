package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static String HOME_PAGE_URL = "https://www.saucedemo.com/";

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(className=  "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3/text()[1]")
    private WebElement errorText;

    public WebDriver driver;

    public static HomePage visitPage(WebDriver driver) {
        HomePage page = new HomePage(driver);
        page.visitPage();
        return page;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void visitPage() {
        this.driver.get(HOME_PAGE_URL);
    }


    public String getUserName() {
        String theField = usernameField.getText();
        return theField;
    }

    public void setUsername(String theUsername) {
        usernameField.clear();
        usernameField.sendKeys(theUsername);
    }

    public void setPassword(String thePassword) {
        passwordField.clear();
        passwordField.sendKeys(thePassword);
    }

    public void login(String theUsername, String thePassword) {
        setUsername(theUsername);
        setPassword(thePassword);
        loginButton.click(); //should submit the form
    }

    public String getErrorText() {
        return errorText.getText();
    }

}