package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexValue {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("(//a[contains(@data-csa-c-slot-id,'nav_cs_4')])[1]")).click();
	driver.findElement(By.xpath("(//a[contains(@data-csa-c-slot-id,'nav_cs_')])[5]")).click();
}
}