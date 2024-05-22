package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Scroll_up_down {
	WebDriver driver;
	public void driverSetting() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	void scrollDown() throws Exception{
		JavascriptExecutor js = ((JavascriptExecutor)driver); //typeCasting
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
	}
	void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-400)", "");
	}
	public static void main(String[] args) throws Exception{
		Scroll_up_down s=new Scroll_up_down();
		s.driverSetting();
		s.scrollDown();
		s.scrollUp();
	}
}
