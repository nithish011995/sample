package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSugeestionsEx2 {				//Selenium 13
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> AllSuggestion = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:AllSuggestion )
		{
			if(wb.getText().contains("sneakers"))
			{
				wb.click();
				break;
			}
		}
}
}