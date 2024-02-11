package pages;
import helpers.BrowserFactory;
import helpers.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class LoginPage extends BasePage {

        public static WebDriver webDriver;

        WebDriverWait wait = new WebDriverWait(Hooks.driver, (10));

        public LoginPage(BrowserFactory baseDriver) {
            super(baseDriver);
        }

        @FindBy(className = "login")
        private WebElement signInButton;

        @FindBy(id= "email") private WebElement email;
        @FindBy(id="passwd") private WebElement password;

        @FindBy(id = "SubmitLogin")
        private WebElement loginButton;

        public WebElement getLoginButton(){
            return this.loginButton;
        }

        public void clickSignInButton() {
            signInButton.click();
        }

        public void setEmail(String email) {
            this.email.sendKeys(email);
        }

        public void setPassword(String password) {
            this.password.sendKeys(password);
        }

        public void clickLoginButton() {
            loginButton.click();
        }


        public void click(WebElement element) {
            element.click();
        }
        public void login(String email, String password) {
            setEmail(email);
            setPassword(password);
            click(loginButton);
        }


    }



