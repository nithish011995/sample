package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {  //types of locators
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.get("https://www.flipkart.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		//using id locators
		
		//driver.findElement(By.name("username")).sendKeys("admin");
			//using name locators
		
		//driver.findElement(By.className("textField")).sendKeys("admin");
			//using classname locators
		
		//driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("admin");
			//when we have id but we dont get uniqueness then we go for cssSselector locator
		
		//driver.findElement(By.xpath())
		//driver.manage().window().maximize();  // to maximize the screen
		
		//driver.manage().window().fullscreen();
		
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		//driver.findElement(By.id("loginButton")).click();
		
		//Thread.sleep(3000);
	//	driver.findElement(By.className("initial")).click();
		
	//	Thread.sleep(5000);
		
		//driver.findElement(By.linkText("View Time-Track")).click();   
		//linktext used when html tags start with a.
		//	driver.findElement(By.linkText("Lock Time-Track")).click();
		
		
		driver.findElement(By.partialLinkText("View T")).click();
		//	//linktext used when html tags start with a.
	
	}

}
