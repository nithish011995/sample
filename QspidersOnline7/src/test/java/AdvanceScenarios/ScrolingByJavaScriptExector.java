package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingByJavaScriptExector { 	 		//16
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.amazon.in/");
		
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			for(int i=0;i<5;i++)
			{
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(1000);
			}
			
			for(int i=0;i<5;i++)
			{
				js.executeScript("window.scrollBy(0,-500)");
				Thread.sleep(1000);
			}*/
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Help']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		
		

	}
}
