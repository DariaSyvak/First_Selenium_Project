package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _12_sendKeys_click_method {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement searchInputBox = driver.findElement(By.cssSelector("#searchInput"));
       // WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));


        searchInputBox.sendKeys("Tesla"+ Keys.ENTER);
        //searchButton.click();
        WebElement nameHeading = driver.findElement(By.cssSelector("#firstHeading"));

        if (nameHeading.getText().equals("Tesla")) System.out.println("Passed");
        else System.out.println("Failed");


        Driver.quitDriver();


    }
}
