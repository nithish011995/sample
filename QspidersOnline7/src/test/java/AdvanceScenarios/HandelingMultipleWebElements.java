package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingMultipleWebElements {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		//Example 1
		
	/*	driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	int count=0;
	for(WebElement link:allLinks)
	{
		System.out.println(link.getText());
		count++;
	}
	System.out.println("Total num of links:" +count);
	*/
		
		//Example 2
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("Total num of links:" +count);

}

}