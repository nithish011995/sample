package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
																	//15
public class DropDownUsingSelectClass {   //This approach used Only when htmlTag starts with select
	public static void main(String[] args) throws Throwable {
		
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);

		//SelectByIndex
	/*WebElement datelist= driver.findElement(By.id("day"));
	Select sel = new Select(datelist);
	sel.selectByIndex(10);
	
	WebElement monthlist= driver.findElement(By.id("month"));
	Select sel1 = new Select(monthlist);
	sel1.selectByIndex(7);
	
	WebElement yearlist= driver.findElement(By.id("year"));
	Select sel2 = new Select(yearlist);
	sel2.selectByIndex(22);*/
	
		//SelectByValue
	/*WebElement datelist= driver.findElement(By.id("day"));
	Select sel = new Select(datelist);
	sel.selectByValue("30");
	

	WebElement monthlist= driver.findElement(By.id("month"));
	Select sel1 = new Select(monthlist);
	sel1.selectByValue("9");
	
	WebElement yearlist= driver.findElement(By.id("year"));
	Select sel2 = new Select(yearlist);
	sel2.selectByValue("1998");*/
	
	//SelectByVisbleText()
	WebElement datelist= driver.findElement(By.id("day"));
	Select sel = new Select(datelist);
	sel.selectByVisibleText("1");
	
	WebElement monthlist= driver.findElement(By.id("month"));
	Select sel1 = new Select(monthlist);
	sel1.selectByVisibleText("Feb");
	WebElement yearlist= driver.findElement(By.id("year"));
	Select sel2 = new Select(yearlist);
	sel2.selectByVisibleText("1995");
	
}
}