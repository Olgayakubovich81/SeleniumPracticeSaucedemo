import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="user-name")
    private WebElement usernameInputField;
    @FindBy(id="password")
    private WebElement passwordInputField;
    @FindBy (id="login-button")
    private WebElement loginButton;

    @FindBy (css = "[data-test=\"error\"]")
    private WebElement errorMessage;



    public void enterValueToUsernameInputField(String usernameValue) {
            usernameInputField.sendKeys(usernameValue);
    }

    public void enterValueToPasswordInputField(String passwordValue) {
        passwordInputField.sendKeys(passwordValue);

            }
     public void clickOnLoginButton (){
        loginButton.click();
     }

     public String getTextFromErrorMessage() {
       return errorMessage.getText();

     }
    public boolean loginButtonIsDisplayed(){
        return loginButton.isDisplayed();
    }

  }

