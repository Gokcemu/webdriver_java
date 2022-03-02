package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuElementPage {

    private WebDriver driver;
    private By home = By.xpath("//a[href='Home']");

    public MenuElementPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage clickHome(){
        driver.findElement(home).click();
        return new HomePage(driver);
    }
}
