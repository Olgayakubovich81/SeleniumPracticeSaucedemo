import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidePanel {
    WebDriver driver;

    public SidePanel (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //logoutLink



    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutLink;



    public void followLogOutLink (){
        logOutLink.click();
    }

}
