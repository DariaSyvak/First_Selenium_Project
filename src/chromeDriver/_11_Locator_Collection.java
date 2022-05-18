package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.nio.file.Watchable;
import java.util.List;

public class _11_Locator_Collection {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");

       List<WebElement> googleLinks=driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));

        for (WebElement googleLink : googleLinks) {
            System.out.println(googleLink.getText());
            System.out.println(googleLink.isDisplayed()&&googleLink.isEnabled() ?"PASSED":"FAILED");

        }
        Driver.quitDriver();
    }
}
