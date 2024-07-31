import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepONe {
    WebDriver driver;

    public CheckOutStepONe(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "continue")
    WebElement continueButton;


    public void inputFirstName() {
        firstNameInput.sendKeys("Olga");
    }

    public void inputLastName() {
        lastNameInput.sendKeys("Figer");

    }

    public void inputPostalCode() {
        postalCodeInput.sendKeys("107066");

    }

    public void clickContinueButton() {
        continueButton.click();

    }
}
