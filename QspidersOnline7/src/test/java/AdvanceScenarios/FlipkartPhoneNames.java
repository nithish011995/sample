package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPhoneNames {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://www.flipkart.com/"
			+ "search?q=iphone&otracker=search&otracker1=search&"
			+ "marketplace=FLIPKART&as-show=off&as=off");*/
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	 List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	 List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	for(int i=0;i<names.size();i++)
	{
		System.out.println(names.get(i).getText()+"\t"+price.get(i).getText());
	}

}
}
