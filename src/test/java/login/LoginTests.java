package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;
import static utils.Config.*;

public class LoginTests extends BaseTests {

    @Test
    public void testNullUsernameandPassword(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(NULL_USER);
        loginPage.setPasswordField(NULL_PASS);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"),
                "Null username and password test failed");
        loginPage.returnHomePage();
    }

    @Test
    public void testWrongUsername(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(FAIL_USER);
        loginPage.setPasswordField(AUTH_PASS);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"),
                "Wrong Username test Failed");
        loginPage.returnHomePage();
    }

    @Test
    public void testWrongPassword(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(AUTH_USER);
        loginPage.setPasswordField(FAIL_PASS);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText().contains("Your password is invalid!"),
                "Wrong Username test Failed");
        loginPage.returnHomePage();
    }

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(AUTH_USER);
        loginPage.setPasswordField(AUTH_PASS);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect!");
        loginPage.returnHomePage();
    }
}
