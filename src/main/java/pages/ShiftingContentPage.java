package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By menuElement = By.linkText("Example 1: Menu Element");
    private By anImage     = By.linkText("Example 2: An image");
    private By list        = By.linkText("Example 3: List");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public MenuElementPage clickMenuElement(){
        driver.findElement(menuElement).click();
        return new MenuElementPage(driver);
    }

    public AnimagePage clickanimage(){
        driver.findElement(anImage).click();
        return new AnimagePage(driver);
    }

    public ListPage clickList(){
        driver.findElement(list).click();
        return new ListPage(driver);
    }
}
