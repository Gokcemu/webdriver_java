package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By homePageTitle = By.xpath("//h1[@class='heading']");
    private WebDriverWait wait;
    protected Alert alert;


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

    public HoversPage clickHover() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public BasicAuthenticationPage clickBasicAuthenticationPage(){
        clickLink("Basic Auth");
        return new BasicAuthenticationPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsButton(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploaderPage clickFileUploadButton(){
        clickLink("File Upload");
        return new FileUploaderPage(driver);
    }

    public ContextMenuPage clickContextMenuButton(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
