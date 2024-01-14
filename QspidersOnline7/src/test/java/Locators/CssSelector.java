package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
				
public class CssSelector {//when we have id but we dont get uniqueness then we go for cssSselector locator
				// [AttributeName="AttributeValue"]
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("admin");//by using id locator 
		
		//for id shortcut is #
		//syntax-->htmltag#AttributeValue    id=#
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		//htmltag[AttributeName="AttributeValue"]
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
		
		//for class shortcut is .  (dot)
		//htmltag.AttributeValue   class=.
		//driver.findElement(By.name("pwd")).sendKeys("manager"); 
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");	
		
		
		//driver.findElement(By.cssSelector("[id=\"loginButton\"]")).click();
		
		
	//	driver.findElement(By.cssSelector("a#loginButton")).click();
		
		//driver.findElement(By.cssSelector("[class=\"initial\"]")).click();//by using class locator
		
		//cssSelector will support only 2 locators ie. id and class 
	}
}
