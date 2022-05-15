package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.awt.dnd.DragGestureEvent;

public class _08_Text_Attribute_CssValue_Of_Web_Elements {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement searchButton=driver.findElement(By.cssSelector("input[value='Google Search']"));
        System.out.println(searchButton.getText());
        System.out.println(searchButton.getAttribute("class"));//gNo
        System.out.println((searchButton.getAttribute("name")));//btnK
        System.out.println((searchButton.getAttribute("role")));//button
        System.out.println(searchButton.getCssValue("color"));
        System.out.println(searchButton.getCssValue("font-family"));
        System.out.println(searchButton.getCssValue("font-size"));
        System.out.println(searchButton.getCssValue("text-align"));


        System.out.println(driver.findElement(By.tagName("body")).getText());
        Driver.quitDriver();
    }
}
