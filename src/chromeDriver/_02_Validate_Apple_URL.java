package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.apple.com/");
        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://www.apple.com/";

        if(actualURL.equals(expectedURL)) System.out.println("The URL validation PASSED");
        else System.out.println("The URL validation FAILED!!!");

        System.out.println("End the program");

        Thread.sleep(5000);
        Driver.quitDriver();
    }
}
