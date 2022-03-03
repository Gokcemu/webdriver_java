package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuElementPage {

    private WebDriver driver;
    private By home      = By.xpath("//a[text()='Home']");
    private By about     = By.xpath("//a[text()='About']");
    private By contactUs = By.xpath("//a[text()='Contact Us']");
    private By portfolio = By.xpath("//a[text()='Portfolio']");
    private By gallery   = By.xpath("//a[text()='Gallery']");

    public MenuElementPage(WebDriver driver){

        this.driver = driver;
    }

    public HomePage clickHome(){
        driver.findElement(home).click();
        return new HomePage(driver);
    }

    public int menuItems(){
        return driver.findElements(By.tagName("li")).size();
    }
}
