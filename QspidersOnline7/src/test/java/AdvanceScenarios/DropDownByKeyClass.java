package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByKeyClass {		//15
	 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement datelist = driver.findElement(By.id("day"));//stored in a variable to perform multiple action
		Thread.sleep(1000);
		datelist.click();
		
		// its select todays date (06)
	/*	// to select 01
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.click();*/
		
		//to select 08
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.click();
	}
}
