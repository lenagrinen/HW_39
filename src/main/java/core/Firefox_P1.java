package core;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox_P1 {	
	
	static WebDriver driver;


public static void main(String[] cla) throws InterruptedException {
	Logger.getLogger("").setLevel(Level.OFF);	               // Suppress Warnings
	
	System.out.println("Browser: Firefox");

	System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
	driver = new FirefoxDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
    final long start = System.currentTimeMillis();

	driver.get("http://facebook.com");
	System.out.println("Title: " + driver.getTitle());
	
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("lena.grihn@gmail.com");
	
	//driver.findElement(By.id("email")).sendKeys("lena.grihn@gmail.com");
	//Thread.sleep(1000);
	
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(System.getenv("fb_password"));
	
	//driver.findElement(By.id("pass")).sendKeys(System.getenv("fb_password"));
	//Thread.sleep(3000);

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
    
	final long finish = System.currentTimeMillis();
	
driver.quit();
    System.out.println("Response time: " + (finish - start) / 1000.0 + " seconds");

	//System.out.println("You have " + friends + " friends");

}
}
