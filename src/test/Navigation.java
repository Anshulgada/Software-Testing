package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;

public class Navigation {
    WebDriver driver;
//    WebDriverWait wait;
    void driverSetting(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    void navigate() throws Exception {
        driver.get("https://www.luminoex.com/register");
        Thread.sleep(1000);     // Needs to throw exception and use try catch while calling this method

//        driver.sleep(10);
//        driver.wait(3000);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        try {
//            // Wait for 7 seconds
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        driver.navigate().forward();
    }

    public static void main(String[] args) {
        Navigation nav = new Navigation();
        nav.driverSetting();


        try {                       // Always required when using Thread.sleep inside the method
            nav.navigate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}