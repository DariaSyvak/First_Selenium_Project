package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.ValidationMethods;

public class TestFacebook {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");
        String expectedURL = "https://www.facebook.com/";
        String expectedTitle = "Facebook - log in or sign up";

        try {


            ValidationMethods.validationTitle(driver, expectedTitle);

            ValidationMethods.validationURL(driver, expectedURL);

            WebElement logo = driver.findElement(By.className("fb_logo"));//By.cssSelector(".fb_logo")
            ValidationMethods.validateIsDisplayed(logo, "LOGO");

            WebElement heading2 = driver.findElement(By.className("_8eso"));
            ValidationMethods.validateIsDisplayed(heading2, "HEADING");

            WebElement emailORPhone = driver.findElement(By.id("email"));
            ValidationMethods.validateIsDisplayed(emailORPhone, "Email OR Phone");

            WebElement password = driver.findElement(By.id("pass"));
            ValidationMethods.validateIsDisplayed(password, "PASSWORD");

            WebElement loginButton = driver.findElement(By.name("login"));
            ValidationMethods.validateIsDisplayed(loginButton, "Login Button");
//        if (loginButton.isDisplayed()) System.out.println("Login  button PASSED");
//        else System.out.println("Password button FAILED");

            WebElement forgotPassword = driver.findElement
                    (By.linkText("Forgot password?"));
            ValidationMethods.validateIsDisplayed(forgotPassword, "Forgot Password");

            WebElement createNewAccount = driver.findElement(By.className("_6lti"));
            ValidationMethods.validateIsDisplayed(createNewAccount, "Create new account button");
        } finally {
            Driver.quitDriver();
        }


    }


}
