package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SecureAreaPage{
    private WebDriver driver;
    private By secureAlert = By.cssSelector("#flash");
    private By logoutButton = By.xpath("//i[text()=' Logout']");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLogoutButton(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

    public String getAlertText(){
        return driver.findElement(secureAlert).getText();
    }
}
