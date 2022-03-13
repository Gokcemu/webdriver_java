package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadFileButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadFileButton(){
        driver.findElement(uploadFileButton).click();
    }

    /**
     * Provides absolute path of file and than clicks the uploadfilebutton
     * @param absolutePathOfFile the path of file
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadFileButton();
    }

    public String uploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }

}
