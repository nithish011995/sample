package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment {
	public static void main(String[] args) throws Throwable {
		
	//WebDriver driver=new ChromeDriver();
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	
	//driver.get("https://www.amazon.in/");
//	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
	}
}
