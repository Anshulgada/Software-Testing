package test;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class CountLink {
	WebDriver driver;
	void driverSetting(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luminoex.com/register");
	}
	void tagName(){
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks=links.size();
		System.out.println("Total Links on Webpage:"+totalLinks);
	}
	public static void main(String[] args) {
		CountLink c=new CountLink();
		c.driverSetting();
		c.tagName();
	}
}