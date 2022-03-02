package login;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.Config.AUTH_PASS;
import static utils.Config.AUTH_USER;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(AUTH_USER);
        loginPage.setPasswordField(AUTH_PASS);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect!");
    }
}
