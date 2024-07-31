import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(className = "inventory_list")
    private WebElement inventoryList;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(className = "inventory_item")
    private List<WebElement> inventoryItems;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> inventoryItemNames;

    @FindBy(css = "img[class = \"inventory_item_img\"]")
    private List<WebElement> inventoryItemImages;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton1;

    @FindBy (id= "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartButton2;

    public boolean inventoryListIsDisplayed() {
        return inventoryList.isDisplayed();
    }

    public void clickOnBurgerMenuButton() {
        burgerMenuButton.click();
    }

    public int getItemsQuantity() {
        return inventoryItems.size();
    }

    public int getItemNamesQuantity() {
        return inventoryItemNames.size();
    }


    public boolean allItemNamesAreNotEmpty() {
        boolean allNotEmpty = true;
        for (WebElement name : inventoryItemNames) {
            if (name.getText().isEmpty()) {
                allNotEmpty = false;
            }
        }
        return allNotEmpty;
    }

    public boolean allItemNamesStartWithSauceLabs() {
        boolean allStartWithSauceLabs = true;
        for (WebElement name : inventoryItemNames) {
            if (!name.getText().startsWith("Sauce Labs")) {

                allStartWithSauceLabs = false;
            }
        }
        return allStartWithSauceLabs;
    }

    public int getItemImagesQuantity() {
        return inventoryItemImages.size();

    }

    public boolean allItemImagesAreDisplayed() {
        boolean allItemImagesAreDiplayed = true;
        for (WebElement image : inventoryItemImages) {
            if (!image.isDisplayed()) {

                allItemImagesAreDiplayed = false;
            }
        }
        return allItemImagesAreDiplayed;
    }


    public void clickOnAddToCartButton1() {
            addToCartButton1.click();
        }

            public void clickOnAddToCartButton2() {
                addToCartButton2.click();
            }
        }



