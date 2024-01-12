package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p3_SelectByVisibleText {
public static void main(String[] args) throws Throwable {	
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		Thread.sleep(2000);

		WebElement datelist = driver.findElement(By.id("day"));
		Select date = new Select(datelist);
		date.selectByVisibleText("10");
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select month = new Select(monthlist);
		month.selectByVisibleText("Aug");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		Select year = new Select(yearlist);
		year.selectByVisibleText("2002");
}
}