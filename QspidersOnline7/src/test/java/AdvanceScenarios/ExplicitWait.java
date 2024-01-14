package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {//particular condition to be satisfy we use explicitwait and 
	//in every 0.5seconds(pooling time and it is fixed) the driver will go check weather the element is present in GUI
//in fluentWait the pooling time is custumize this is the only difference b/w fluemt &explicit wait
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		
		WebElement login = driver.findElement(By.className("initial"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));	//or//wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
		
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.titleContains("Enter Time-Track"));
			
	
			
		

}
}