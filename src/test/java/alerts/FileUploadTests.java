package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

import static org.testng.Assert.assertEquals;
import static utils.Config.ABSOLUTE_FILE_PATH;

public class FileUploadTests extends BaseTests {

    @Test
    public void testUploadFile(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUploadButton();
        fileUploaderPage.uploadFile(ABSOLUTE_FILE_PATH);
        assertEquals(fileUploaderPage.uploadedFiles(), "chromedriver.exe",
                "File Uplaod Failed");
    }
}
