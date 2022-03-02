package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ForgotPasswordPage {

    private WebDriver driver;
    private By retrievePasswordButton = By.id("form_submit");
    private By setEmailField = By.id("email");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailField(String email){

        driver.findElement(setEmailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }
}
