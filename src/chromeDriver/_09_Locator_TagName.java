package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _09_Locator_TagName {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement h1Heading=driver.findElement(By.tagName("h1"));
        if(h1Heading.isDisplayed()) System.out.println("WIKIPEDIA heading1 is displayed");
        else System.out.println("WIKIPEDIA heading1 is NOT displayed");

        WebElement logo=driver.findElement(By.cssSelector(".central-featured-logo"));
        if(logo.isDisplayed()) System.out.println("WIKIPEDIA LOGO is displayed");
        else System.out.println("WIKIPEDIA LOGO is NOT displayed");

        WebElement searchInput=driver.findElement(By.id("searchInput"));//css(#searchInput)
        if(searchInput.isDisplayed()) System.out.println("Search input box is displayed");
        else System.out.println("Search input box is NOT displayed");

        WebElement searchButton=driver.findElement(By.className("pure-button"));
        if(searchButton.isDisplayed())System.out.println("Search button is displayed");
        else System.out.println("Search button is  NOT displayed");

        if(searchButton.isEnabled()) System.out.println("Search button is enabled");
        else System.out.println("Search button is NOT enabled");


        System.out.println(h1Heading.getText());
        Driver.quitDriver();


    }
}
