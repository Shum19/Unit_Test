package Practice.fifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "/Users/Mikle/Applications/Safari.app");

        WebDriver driver = new SafariDriver();

        driver.get("http://aviabit.airmg.ru");

        Thread.sleep(10000);
        driver.quit();

    }
}
