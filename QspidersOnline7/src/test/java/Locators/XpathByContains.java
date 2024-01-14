package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	
	//xpath by contains AttributeValue
	
	 //syntax:--->htmltag[contains(@AttributeNmae,'AttributeValue')]
	
	//Example 1
	
	//driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");//here by using contains we remove partial text
	
	//Example 2
	//driver.get("https://www.facebook.com/");
	//driver.findElement(By.xpath("//input[contains(@placeholder,'E')]")).sendKeys("8952");//using contains we remove num ,space


	//xpath by contains vissibleText()
	
	 //syntax:--->htmltag[contains(text(),'AttributeValue')]
	
	//Example 1
	//	driver.get("https://www.flipkart.com");
	//	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//	driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	
	//Example 2
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();

}
}
