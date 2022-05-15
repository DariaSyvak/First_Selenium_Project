package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver", "/Users/dariasyvak/IdeaProjects/First_Selenium_Project/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.techglobalschool.com/");//driver.navigate().to()
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

        String expectedTITLE = "Amazon.com. Spend less. Smile more.";
        String expectedURL = "https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();
        String actualTITLE = driver.getTitle();

        if (actualURL.equals(expectedURL)) System.out.println("The URL validation PASSED");
        else System.out.println("The URL validation FAILED!!!");
        if (actualTITLE.equals(expectedTITLE)) System.out.println("The TITLE validation PASSED");
        else System.out.println("The TITLE validation FAILED");

        Thread.sleep(5000);
        driver.quit();


    }
}
