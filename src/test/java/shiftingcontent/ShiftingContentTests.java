package shiftingcontent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuElementPage;
import pages.ShiftingContentPage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ShiftingContentTests extends BaseTests {

    @Test
    public void testMenuElements(){
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();
        MenuElementPage menuElementPage = shiftingContentPage.clickMenuElement();
        assertEquals(menuElementPage.menuItems(), 5, "Wrong item size");
    }

    @Test
    public void testMenuElementReturnHomePage(){
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();
        MenuElementPage menuElementPage = shiftingContentPage.clickMenuElement();
        HomePage homePage = menuElementPage.clickHome();
        assertTrue(homePage.getTitle().contains("Welcome to the-internet"),
                "Page couldn't navigate to the home page");
    }
}
