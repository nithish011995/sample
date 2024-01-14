package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownUsingXpath {			//16
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("day"));
		
		driver.findElement(By.xpath("//option[text()='15']")).click();
		driver.findElement(By.xpath("//option[text()='Aug']")).click();
		driver.findElement(By.xpath("//option[text()='2020']")).click();
}}
