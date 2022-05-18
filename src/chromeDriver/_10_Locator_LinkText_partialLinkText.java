package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.ValidationMethods;

public class _10_Locator_LinkText_partialLinkText {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement aboutLink=driver.findElement(By.linkText("About"));
        WebElement storeLink=driver.findElement(By.partialLinkText("Store"));
        WebElement gmailLink=driver.findElement(By.partialLinkText("Gmail"));
        WebElement imagesLink=driver.findElement(By.partialLinkText("Images"));

        System.out.println(aboutLink.getText());
        System.out.println(storeLink.getText());
        System.out.println(gmailLink.getText());
        System.out.println(imagesLink.getText());

        System.out.println(aboutLink.isDisplayed()&&aboutLink.isEnabled()? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");





        Driver.quitDriver();

    }
}
