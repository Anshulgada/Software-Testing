package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class PartialLinkTest {
    WebDriver driver;

    public void driverSetting() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    public void fbSignup() throws Exception {
        driver.findElement(By.partialLinkText("Create new")).click();
        Thread.sleep(3000); // sleep for 3 seconds
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Anshul");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Gada");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("anshulgada@parul.com");
        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("anshulgada@parul.com");
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("anshulgada05@gmail.com");
    }

    void dropdown() {
        WebElement day = driver.findElement(By.id("day"));          // Choose Day
        Select selectDay = new Select(day);                    // Create Obj to then use it to select the opts
        selectDay.selectByIndex(24);

        WebElement month = driver.findElement(By.id("month"));      // Choose Month
        Select selectMonth = new Select(month);                // Create Obj to then use it to select the opts
        selectMonth.selectByValue("6");

        WebElement year = driver.findElement(By.id("year"));       // Choose Year
        Select selectYear = new Select(year);                 // Create Obj to then use it to select the opts
        selectYear.selectByVisibleText("2003");
    }

    void radioButton() {

        //  Using XPath
//        driver.findElement(By.className("_58mt")).click();      // Clicks first default option
        driver.findElement(By.xpath("//*[starts-with(@id, 'u_2_5_')]")).click();       // By Partial ID Match
//        driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();                 // By Attribute Value
//        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();                      // By Position

        // Using CSS Selectors
//        driver.findElement(By.cssSelector("input[id^='u_2_5_']")).click();             // By Partial ID Match
//        driver.findElement(By.cssSelector("input[name='sex'][value='2']")).click();    // By Attribute Value

    }

    public static void main(String[] args) {
        PartialLinkTest plt = new PartialLinkTest();
        plt.driverSetting();

        try {
            plt.fbSignup();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        plt.dropdown();
        plt.radioButton();
    }

}