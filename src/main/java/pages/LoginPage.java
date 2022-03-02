package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


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

        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String getAlertText(){
       return driver.findElement(secureAlert).getText();
    }

}
