package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _07_Enabled_ {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.techglobalschool.com/apply-now");

        WebElement displayed=driver.findElement(By.id("comp-kuiqjiul2label"));
        if(displayed.isDisplayed())System.out.println("Apply Now is displayed");
        else System.out.println("Apply Now is  NOT displayed");

        if(displayed.isEnabled()) System.out.println("Apply Now is enabled");
        else System.out.println("Apply Now is NOT enabled");


        Driver.quitDriver();
    }
}
