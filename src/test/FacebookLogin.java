package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
    WebDriver driver;

    public void driverSetting() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    public void fbLogin() throws Exception {
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("anshulgada@hotmail.com");
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("adamwarlock300");
//        Thread.sleep(2500); // sleep for 2.5 seconds
//        driver.findElement(By.cssSelector("button[name='login']")).click();
        driver.findElement(By.xpath("//*[starts-with(@id, 'u_0_5_')]")).click();
    }

    public static void main(String[] args) throws Exception {
        FacebookLogin fl = new FacebookLogin();
        fl.driverSetting();
        fl.fbLogin();
    }
}