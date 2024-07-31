import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutComplete {
    WebDriver driver;

    public CheckOutComplete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "complete-header")
    WebElement successPurchaseText;

    public String checkSuccessPurchaseText() {
        return successPurchaseText.getText();
    }
}
