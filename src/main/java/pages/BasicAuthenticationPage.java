package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAuthenticationPage {
    private WebDriver driver;

    public BasicAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName(String userName) {
        driver.switchTo().alert().sendKeys(userName);
    }

    public void setPassword(String password){
        driver.switchTo().alert().sendKeys(password);
    }
    public void confirmAlert(){
        driver.switchTo().alert().accept();
    }
}
