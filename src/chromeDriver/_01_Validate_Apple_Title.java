package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) throws InterruptedException {
        //1.Set up driver
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "/Users/dariasyvak/IdeaProjects/First_Selenium_Project/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriver driver=Driver.getDriver();

        //2.Validation
        driver.get("https://www.apple.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple";
        if (actualTitle.equals(expectedTitle)) System.out.println("The title validation PASSED");//Apple
        else System.out.println("The title validation FAILED!!!");

        System.out.println("End of the program");

        Thread.sleep(5000);
        Driver.quitDriver();
    }

}
