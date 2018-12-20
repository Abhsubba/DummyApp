package www.BestBuy.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
                import org.openqa.selenium.WebDriver;
                import org.openqa.selenium.WebElement;
                import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuy {

        public static void main(String[] args) {

 /*               System.setProperty("webdriver.gecko.driver","/home/abhirup/.jenkins/workspace/BestBuyAuto/BestBuy/BestBuyMavenArtiFact");
                WebDriver driver = new FirefoxDriver();

                 // launch Fire fox and direct it to the Base URL
        driver.get("https://www.target.com/");

                             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                driver.close();
*/


        }
        static void Test() {
        	
            System.setProperty("webdriver.gecko.driver","/home/abhirup/.jenkins/workspace/BestBuyAuto/BestBuy/BestBuyMavenArtiFact/geckodriver");
            WebDriver driver = new FirefoxDriver();

             // launch Fire fox and direct it to the Base URL
    driver.get("https://www.target.com/");

                         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            driver.close();

        }

}