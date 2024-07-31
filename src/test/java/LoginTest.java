import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

  //    @Test
//    public void successLoginWithoutPO(){
//        WebElement usernameInputField =driver.findElement(By.id("user-name"));
//        usernameInputField.sendKeys("standard_user");
//        WebElement passwordInputField= driver.findElement(By.id("password"));
//        passwordInputField.sendKeys("secret_sauce");
//        WebElement loginButton =driver.findElement(By.id("login-button"));
//        loginButton.click();
//        WebElement inventoryList =driver.findElement(By.className("inventory_list"));
//        assertTrue(inventoryList.isDisplayed());
//
//    }


    @Test
    public void successLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());

    }

    @Test
    public void invalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("12344");
        loginPage.clickOnLoginButton();
        assertEquals("Epic sadface: Username and password do not match any user in this service", loginPage.getTextFromErrorMessage());
        assertTrue(loginPage.getTextFromErrorMessage()
                .contains("Username and password do not match any user in this service"));
    }

    @Test
    public void lockedOutUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("locked_out_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();

        assertTrue(loginPage.getTextFromErrorMessage()
                .contains("Sorry, this user has been locked out."));


    }

    @Test
    public void logoutTest() {
        //log in
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterValueToUsernameInputField("standard_user");
        loginPage.enterValueToPasswordInputField("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        //click on burger menu
        inventoryPage.clickOnBurgerMenuButton();
        //follow the Logout link
        SidePanel sidePanel = new SidePanel(driver);
        sidePanel.followLogOutLink();
        //check that we are on the Login page
        assertTrue(loginPage.loginButtonIsDisplayed());
    }



}














