package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Config.AUTH_PASS;
import static utils.Config.AUTH_USER;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By secureAlert = By.cssSelector("#flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(AUTH_USER);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(AUTH_PASS);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String getAlertText(){
       return driver.findElement(secureAlert).getText();
    }

}
