package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidationMethods {

    /**
    create a public static method which will take a driver and expected title
    if the actual title is matching with expected print out validation message
    otherwise throw a new exception with message included expected and actual title

     */
    public static void ValidationTitle(WebDriver driver,String expectedTitle){
        if(expectedTitle.equals(driver.getTitle()))System.out.println("Validation of Title Approved");
        else throw new RuntimeException("Expected title"+expectedTitle+
                "is not matching with actual "+driver.getTitle());

    }
    public static void ValidationURL(WebDriver driver,String expectedURL){
        if(expectedURL.equals(driver.getCurrentUrl())) System.out.println("Validation of URL Approved");
        else throw new RuntimeException("Expected URL"+expectedURL+
                "is not matching with actual "+driver.getCurrentUrl());
    }
}
