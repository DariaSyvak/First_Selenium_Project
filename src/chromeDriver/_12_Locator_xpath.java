package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _12_Locator_xpath {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        List<WebElement> googleLinks=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));
        String []text={"Advertising","Business","How Search works"};

        for (int i =0;i <googleLinks.size();i++) {
            if(googleLinks.get(i).isEnabled()&&googleLinks.get(i).isDisplayed()&&googleLinks.get(i).getText().equals(text[i]))
            System.out.println(text[i] + " link validation is PASSED");
            else System.out.println(text[i] + " link validation is FAILED");
        }
        Driver.quitDriver();


    }
}
