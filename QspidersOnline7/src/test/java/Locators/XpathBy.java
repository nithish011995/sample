package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBy{


	public static void main(String[] args) throws Throwable {
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		//driver.get("https://demo.actitime.com/login.do");
		
		//xpath by AttributeValue
		
		 //syntax:--->htmltag[(@AttributeNmae='AttributeValue')]
		
		//Example 1
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		
		//Example 2

		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
		
		
		//xpath by vissibleText()
		
		 //syntax:--->htmltag[(text()='AttributeValue')] or htmltag[(.='AttributeValue')]
		
		
	//	Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();//visible method
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='Approve Time-Track']")).click();//visible method
	}
}
//when we dont know htmltag then can use * inplace of htmltag
   //example for xpath by visibletext

//syntax:--->*[(text()='AttributeValue')]
