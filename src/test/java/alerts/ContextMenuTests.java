package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClickandAcceptAlert(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenuButton();
        contextMenuPage.rightClickContext();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu",
                "Right Click Context Test Failed" );
        contextMenuPage.acceptAlert();
    }
}
