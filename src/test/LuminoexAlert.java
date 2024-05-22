package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuminoexAlert {
    WebDriver driver;

    void driverSetting(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.luminoex.com/");
    }

    void alert() throws Exception {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);     // Keeps the alert on screen or 5 seconds before clicking 'ok'
        alert.accept();
    }

    public static void main(String[] args) throws Exception {
        LuminoexAlert la = new LuminoexAlert();
        la.driverSetting();
        la.alert();
    }
}
