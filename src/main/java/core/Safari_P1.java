package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari_P1 {
	

	static WebDriver driver;

	public static void main(String[] cla) throws InterruptedException {
		
		System.out.println("Browser: Safari");

		driver = new SafariDriver();

		driver.get("http://facebook.com");
	}
	}
