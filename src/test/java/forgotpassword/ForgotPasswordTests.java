package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;
import static utils.Config.DEFAULT_EMAIL;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailField(DEFAULT_EMAIL);
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        //Currently, page get Internal Server Error, test will be added after that error fixed
    }
}
