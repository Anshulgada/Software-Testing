package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import com.google.common.io.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBScreenshot {
    WebDriver driver;

    void driverSetting(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    void screenshot() throws IOException {
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location = new File("G:\\Software Testing\\FBScreenshot.png");
        Files.copy(screenshotFile, location);
    }

    public static void main(String[] args) throws Exception {
        FBScreenshot ss = new FBScreenshot();
        ss.driverSetting();
        ss.screenshot();
    }
}
