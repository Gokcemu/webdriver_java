package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By clickJSAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By clickJSConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By clickJSPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(By xpath){
        driver.findElement(xpath).click();
    }

    public void clickJSAlertButton(){
        clickButton(clickJSAlertButton);
    }

    public void clickJSConfirmButton(){
        clickButton(clickJSConfirmButton);
    }

    public void clickJSPromptButton(){
        clickButton(clickJSPromptButton);
    }

    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void alert_dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void enterPromptValue(String prompt){
        driver.switchTo().alert().sendKeys(prompt);
    }

    public String getResult(){
       return driver.findElement(result).getText();
    }

}
