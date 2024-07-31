import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryTest extends BaseTest {

    @Test
    public void checkItemsQuantity() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        //check that there are 6 items on the page
        assertEquals(6, inventoryPage.getItemsQuantity());
        assertEquals(6, inventoryPage.getItemNamesQuantity());
    }

    @Test
    public void checkItemNames(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        assertEquals(6, inventoryPage.getItemNamesQuantity());
        assertTrue(inventoryPage.allItemNamesAreNotEmpty());
        assertTrue(inventoryPage.allItemNamesStartWithSauceLabs());
    }


    @Test
    public void checkItemPhotos(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        //Check that there are 6 photos
        assertEquals(6, inventoryPage.getItemImagesQuantity());
        //Check that all photos are displayed
        assertTrue(inventoryPage.allItemImagesAreDisplayed());



    }
}
