package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsAmazon {  //selenium=12//not working properly
	
	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
	Thread.sleep(2000);
	List<WebElement> AllSuggestion = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
		
	for(WebElement wb:AllSuggestion )
	{
		if(wb.getText().contains("puma shoes"))
		{wb.click();
			break;
		}		
	}
}
}
