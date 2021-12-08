package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


        //print all tag elements with "a"
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //click on Inputs
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        //fullscreen the window
        driver.manage().window().fullscreen();

        //quit session
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
