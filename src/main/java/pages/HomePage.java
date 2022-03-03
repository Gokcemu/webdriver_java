package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By homePageTitle = By.xpath("//h1[@class='heading']");

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(homePageTitle).getText();
    }

    public LoginPage clickFromAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public ShiftingContentPage clickShiftingContent(){
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
