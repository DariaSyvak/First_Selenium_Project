package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationMethods {

    /**
    create a public static method which will take a driver and expected title
    if the actual title is matching with expected print out validation message
    otherwise throw a new exception with message included expected and actual title

     */
    public static void validationTitle(WebDriver driver, String expectedTitle){
        if(expectedTitle.equals(driver.getTitle()))System.out.println("Validation of Title Approved");
        else throw new RuntimeException("Expected title \""+expectedTitle+
                "\" is not matching with actual title: \""+driver.getTitle()+"\"");

    }
    public static void validationURL(WebDriver driver, String expectedURL){
        if(expectedURL.equals(driver.getCurrentUrl())) System.out.println("Validation of URL Approved");
        else throw new RuntimeException("Expected URL \""+expectedURL+
                "\" is not matching with actual URL: \""+driver.getCurrentUrl()+"\"");
    }


    public static void validateIsDisplayed(WebElement webElement){
        if (webElement.isDisplayed()) System.out.println("Web element is DISPLAYED");
        else System.out.println("Web element is NOT DISPLAYED");
    }

    public static void validateIsDisplayed(WebElement webElement, String webElementName){
        if (webElement.isDisplayed()) System.out.println(webElementName + " is DISPLAYED");
        else  throw new RuntimeException((webElementName + " is NOT DISPLAYED"));
    }
}
