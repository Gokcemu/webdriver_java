package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.log.Log;

import java.util.logging.Logger;

public class SecureAreaPage extends LoginPage {
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver){
        super(driver);
        //this.driver = driver;
    }


}
