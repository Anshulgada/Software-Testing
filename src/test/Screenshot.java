package test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
    WebDriver driver;

    void driverSetting(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    void screenshot() {
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location = new File("G:\\Software Testing\\Screenshot.png");

        try {

        }catch (IOException e){

        }
    }
    public static void main(String[] args) throws Exception {
        Screenshot ss = new Screenshot();
        ss.driverSetting();
        ss.screenshot();
    }
}
