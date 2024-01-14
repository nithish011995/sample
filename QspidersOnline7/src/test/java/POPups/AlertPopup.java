package POPups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do ");
		
	 driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	
	 Thread.sleep(2000);
	 //driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
	 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Types of Work")).click();
	 driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	 driver.findElement(By.name("name")).sendKeys("kabaddi");
	 driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	 
	 Alert alt = driver.switchTo().alert();
	 //alt.accept();
	 alt.dismiss();
	}
}