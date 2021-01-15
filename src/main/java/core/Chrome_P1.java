package core;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_P1 {	
	
	static WebDriver driver;


public static void main(String[] cla) throws InterruptedException {
	
	Logger.getLogger("").setLevel(Level.OFF);	               // Suppress Warnings

	

	System.out.println("Browser: Chrome");

	System.setProperty("webdriver.chrome.driver", "/Users/elenagrinenko/Downloads/chromedriver");
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);

	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	System.out.println("Title: " + driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("lena.grihn@gmail.com");
	//input[@id='email']
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys(System.getenv("fb_password"));
	//input[@id='pass']
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	//button[@id='u_0_b']
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/img")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/a/div[1]/div[2]/div/div/div/div[2]/span")).click();
	Thread.sleep(3000);	
//String friends = driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/a[4]/div[1]/span")).getText();
	//Thread.sleep(3000);	

	driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/img")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]")).click();
	driver.quit();
	//System.out.println("You have " + friends + " friends");
	


	}
}
