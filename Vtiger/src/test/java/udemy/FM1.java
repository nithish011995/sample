package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FM1 {
	
	@Test
	
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/client/");
		 driver.findElement(By.id("userEmail")).sendKeys("kabaddi@gmail.com");
		 driver.findElement(By.id("userPassword")).sendKeys("Nithishkabaddi@1");
		 driver.findElement(By.id("login")).click();
	}
	

}
