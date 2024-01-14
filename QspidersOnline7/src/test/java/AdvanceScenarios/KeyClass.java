package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClass {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
				//CASE:-1
		//driver.findElement(By.id("username")).sendKeys("admin");
		//WebElement password = driver.findElement(By.name("pwd"));
		//password.sendKeys("manager");
		//password.sendKeys(Keys.ENTER);
		
		//		CASE:--2
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);*/
		
				//CASE:-3
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB, "manager",Keys.ENTER);
	
	
					//case:-4
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB, "manager",Keys.TAB,Keys.SPACE);
		
	}
}
