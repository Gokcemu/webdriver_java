package logout;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;
import static utils.Config.AUTH_PASS;
import static utils.Config.AUTH_USER;


public class LogoutTests extends BaseTests {

    @Test
    public void testSuccessfulLogout()   {
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsernameField(AUTH_USER);
        loginPage.setPasswordField(AUTH_PASS);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        LoginPage loginPage1 = secureAreaPage.clickLogoutButton();
        assertTrue(loginPage1.getAlertText().contains("You logged out of the secure area!"),
                "Your logout request failed");
    }
}

