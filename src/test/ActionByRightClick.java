package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionByRightClick {
    public static void main(String[] args) {

        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Reload after 10 secs if it doesn't open
        driver.get("https://www.facebook.com/");

        WebElement emailBox = driver.findElement(By.id("email"));       // Store the username field in a variable

        emailBox.sendKeys("Anshul");                    // Type the str in the email field
        Actions act = new Actions(driver);
        act.contextClick(emailBox).build().perform();             // Right Click & Build & Perform
    }
}
