package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LuminoexLogin {
    WebDriver driver;

    public void driverSetting() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.luminoex.com/login");
    }

    void LumiLogin() throws Exception {
        Thread.sleep(2000); // sleep for 2 seconds
        driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("anshul@parul.com");
        driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("anshul");
        driver.findElement(By.className("login-button")).click();
    }

    void scrollDown() throws Exception{
        JavascriptExecutor js = ((JavascriptExecutor)driver); //typeCasting
        js.executeScript("window.scrollBy(0, 400)", "");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws Exception {
        LuminoexLogin ll = new LuminoexLogin();
        ll.driverSetting();
        ll.scrollDown();
        ll.LumiLogin();
    }

}