package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    WebDriver driver;

    void driverSetting() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Reload after 10 secs if it doesn't open
        driver.get("https://jqueryui.com/droppable/");
    }

    void dragDrop() throws Exception {

        Thread.sleep(3000);     // Wait for 3 seconds before starting the drag drop operation

        // driver.switchTo().frame(0);  // Used when iframe tag is used in HTML elements (Present here hence this method also works)
        // OR

        WebElement iframe = driver.findElement(By.className("demo-frame"));    // Find frame (which has the draggable elements) from the divs present
        driver.switchTo().frame(iframe);                                       // Switch to that frame

        // Locate Source Element
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        // Locate Target Element
        WebElement targetElement = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);                                   // Create actions object (Required in both methods)

        // Method 1 for drag and drop using Target and Source Elements as args
        action.dragAndDrop(sourceElement, targetElement).build().perform();

        // OR
        // Method 2 for D&D using click&Hold Source and then move to Target & then release and perform
        // action.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();
    }

    public static void main(String[] args) throws Exception {
        DragAndDrop dd = new DragAndDrop();
        dd.driverSetting();
        dd.dragDrop();
    }
}
