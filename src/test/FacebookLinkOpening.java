package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookLinkOpening {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
//		driver.close();
	}
}
