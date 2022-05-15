package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _04_Locator_Class_Name {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement googleImage=driver.findElement(By.className("lnXdpd"));

        if(googleImage.isDisplayed()) System.out.println("Google image validation is Passed");
        else System.out.println("Google image validation is Failed");

        Driver.quitDriver();

    }
}
