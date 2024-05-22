package test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) {

        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Reload after 10 secs if it doesn't open
        driver.get("https://www.facebook.com/");

        WebElement txtUsername = driver.findElement(By.id("email"));       // Store the username field in a variable

        Actions builder = new Actions(driver);

        Action seriesOfActions = builder
                .moveToElement(txtUsername)             // Go to username field
                .click()                                // Single or Left click on username field
                .keyDown(txtUsername, Keys.SHIFT)       // Press Shift key
                .sendKeys(txtUsername, "hello")   // HELLO is sent
                .keyUp(txtUsername, Keys.SHIFT)         // Release Shift key
                .doubleClick(txtUsername)   // To select the text we input (HELLO)
                .contextClick()             // To Right click
                .build();                   // End and build the action

        seriesOfActions.perform();          // Perform the action
    }
}
