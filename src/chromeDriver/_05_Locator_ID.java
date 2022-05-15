package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _05_Locator_ID {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement logo=driver.findElement(By.id("img_comp-kuiqjide2"));
        if (logo.isDisplayed()) System.out.println("The logo is PASSED");
        else System.out.println("The logo is FAILED");

        WebElement  compName=driver.findElement(By.id("comp-kuiqjidf"));
        if (compName.isDisplayed()&&compName.getText().equals("TechGlobal")) System.out.println("The Company Name is PASSED");
        else System.out.println("The Company Name is FAILED");

        WebElement quote =driver.findElement(By.id("comp-kuiqjidf1"));
        if(quote.isDisplayed()&&quote.getText().equals("OUR GOAL IS YOUR SUCCESS"))System.out.println("The Company Quote is PASSED");
        else System.out.println("The Company Quote is FAILED");

        System.out.println(quote.getText());
        System.out.println(compName.getText());


        Driver.quitDriver();

    }
}
