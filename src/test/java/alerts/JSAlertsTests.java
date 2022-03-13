package alerts;

import base.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;
import static utils.Config.DEFAULT_EMAIL;

public class JSAlertsTests extends BaseTests {

    @Test
    public void testAcceptJSAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsButton();
        javaScriptAlertsPage.clickJSAlertButton();
        javaScriptAlertsPage.alert_acceptAlert();
        assertEquals(javaScriptAlertsPage.getResult(), "You successfully clicked an alert",
                "Trigger JS Alert and accept test failed");
    }

    @Test
    public void testAcceptJSConfirm(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsButton();
        javaScriptAlertsPage.clickJSConfirmButton();
        javaScriptAlertsPage.alert_acceptAlert();
        assertEquals(javaScriptAlertsPage.getResult(), "You clicked: Ok",
                "Trigger JS Confirm and accept test failed");
    }

    @Test
    public void testDissmisJSConfirm(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsButton();
        javaScriptAlertsPage.clickJSConfirmButton();
        javaScriptAlertsPage.alert_dismissAlert();
        assertEquals(javaScriptAlertsPage.getResult(), "You clicked: Cancel",
                "Trigger JS Confirm and dismiss test failed");
    }

    @Test
    public void testEnterPromptValueandAccept(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsButton();
        javaScriptAlertsPage.clickJSPromptButton();
        javaScriptAlertsPage.enterPromptValue(DEFAULT_EMAIL);
        javaScriptAlertsPage.alert_acceptAlert();
        assertEquals(javaScriptAlertsPage.getResult(), "You entered: " + DEFAULT_EMAIL,
        "Enter a prompt value and accept test failed");
    }

    @Test
    public void testEnterPromptValueandDissmis(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsButton();
        javaScriptAlertsPage.clickJSPromptButton();
        javaScriptAlertsPage.enterPromptValue(DEFAULT_EMAIL);
        javaScriptAlertsPage.alert_dismissAlert();
        assertEquals(javaScriptAlertsPage.getResult(), "You entered: null",
                "Enter a prompt value and dissmis test failed");
    }
}
