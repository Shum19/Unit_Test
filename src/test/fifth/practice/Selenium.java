package fifth.practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;

public class Selenium {
    @Test
    public void searchGoogleCom(){
//        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");//"/usr/bin/safaridriver"
        WebDriver driver = new SafariDriver();
        driver.get("http://www.google.com/");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Hey");
    }
}
