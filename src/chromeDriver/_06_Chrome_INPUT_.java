package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _06_Chrome_INPUT_ {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement input=driver.findElement(By.name("q"));
        if(input.isDisplayed()) System.out.println("Input is VALIDATE");
        else System.out.println("Input is NOT VALIDATE");



        Driver.quitDriver();
    }
}
