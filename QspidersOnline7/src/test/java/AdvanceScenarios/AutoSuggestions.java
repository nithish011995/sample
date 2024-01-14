package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {//selenium 12

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.tagName("li"));//1of8 puma suggestions
		for(WebElement wb:suggestion )
		{
			if(wb.getText().contains("puma slippers men"))
			{
				Thread.sleep(1000);
				wb.click();
				break;
			}
		}
	}
}