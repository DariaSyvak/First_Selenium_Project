package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _14_Form_Exercise {
    public static void main(String[] args) throws InterruptedException {
        /*
        Send keys to subscribe form and make sure the keys sent are passed
1. Enter “John” to “Enter your first name” input box
2. Enter “Doe” to “Enter your last name” input box
3. Enter “john.doe@gmail.com” to “Add your email” input box
4. Validate the keys sent are passed in the DOM
         */
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");
        WebElement firstNameInputBox = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputBox = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailNameInputBox = driver.findElement(By.id("input_comp-khwb0zsz"));

        String name="John";
        String lName="Doe";
        String email="john.doe@gmail.com";

        firstNameInputBox.sendKeys(name);
        lastNameInputBox.sendKeys(lName);
        emailNameInputBox.sendKeys(email);

        System.out.println(firstNameInputBox.getAttribute("value").equals(name));
        System.out.println(lastNameInputBox.getAttribute("value").equals(lName));
        System.out.println(emailNameInputBox.getAttribute("value").equals(email));

        System.out.println(firstNameInputBox.getAttribute("maxLength"));
        System.out.println(lastNameInputBox.getAttribute("maxLength"));
        System.out.println(emailNameInputBox.getAttribute("maxLength"));

        Thread.sleep(2000);
        firstNameInputBox.clear();
        Thread.sleep(1000);
        firstNameInputBox.sendKeys("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000123");
        System.out.println(firstNameInputBox.getAttribute("value"));
        System.out.println(firstNameInputBox.getAttribute("value").length());

        Driver.quitDriver();



    }
}
