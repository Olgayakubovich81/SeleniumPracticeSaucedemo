import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckOutTest extends BaseTest{
    @Test
    public void successCheckout(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickOnAddToCartButton1();
        inventoryPage.clickOnAddToCartButton2();
        Header header= new Header(driver);
        header.clickOnCartItem();
        CartPage cartPage =new CartPage(driver);
        cartPage.checkoutButton();
        CheckOutStepONe checkOutStepONe=new CheckOutStepONe(driver);
        checkOutStepONe.inputFirstName();
        checkOutStepONe.inputLastName();
        checkOutStepONe.inputPostalCode();
        checkOutStepONe.clickContinueButton();
        CheckOutStepTwo checkoutStepTwo= new CheckOutStepTwo (driver);
        checkoutStepTwo.clickFinishButton();
        CheckOutComplete checkOutComplete=new CheckOutComplete(driver);
        assertEquals("Thank you for your order!", checkOutComplete.checkSuccessPurchaseText());



        //Auth
        //Add 2 items to cart (backpack and bike light)
        //Go to cart page
        //Go to checkout step one page
        //Go to checkout step two page
        //Check that purchase was successful
    }
    }


