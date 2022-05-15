package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ValidationMethods;

import java.util.concurrent.TimeUnit;

public class _DIOR_ {

    static final String d1URL = "https://www.dior.com/en_us";
    static final String d2URL = "https://www.dior.com/en_us/fashion";
    static final String d3URL = "https://www.dior.com/en_us/womens-fashion/shoes/sneakers";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/dariasyvak/IdeaProjects/First_Selenium_Project/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //validation
        //comes from requirement
        //1
        String expected_d1URL = "https://www.dior.com/en_us";
        String expected_d1Title= "Dior official website | DIOR";
        //2
        String expected_d2URL = "https://www.dior.com/en_us/fashion";
        String expected_d2Title= "MODE & ACCESSOIRES | DIOR";
        //3
        String expected_d3URL = "https://www.dior.com/en_us/womens-fashion/shoes/sneakers";
        String expected_d3Title= "Designer Sneakers — Women's Shoes | DIOR";

        //comes from real life product


       try{
           driver.get(d1URL);
           Thread.sleep(4000);
           ValidationMethods.ValidationTitle(driver,expected_d1Title);
           ValidationMethods.ValidationURL(driver,expected_d1URL);

           driver.navigate().to(d2URL);
           Thread.sleep(4000);
           ValidationMethods.ValidationTitle(driver,expected_d2Title);
           ValidationMethods.ValidationURL(driver,expected_d2URL);

           driver.navigate().to(d3URL);
           Thread.sleep(4000);
           ValidationMethods.ValidationTitle(driver,expected_d3Title);
           ValidationMethods.ValidationURL(driver,expected_d3URL);

           driver.navigate().back();
           driver.navigate().forward();
       }
       catch (Exception e){
           //e.printStackTrace();
           System.out.println(e.getMessage());

       }finally {
           driver.quit();




       }






    }
}
