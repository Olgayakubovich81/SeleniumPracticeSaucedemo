import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwo {
    WebDriver driver;

    public CheckOutStepTwo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
  @FindBy(id="finish")
    WebElement finishButton;


public void clickFinishButton() {
    finishButton.click();
}

}