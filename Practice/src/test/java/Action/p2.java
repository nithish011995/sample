package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p2 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Actions methods---->sendkeys(),perform(),click(),build()
	
			driver.get("https://demo.actitime.com/login.do");
			WebElement UN = driver.findElement(By.id("username"));
			WebElement PWD = driver.findElement(By.name("pwd"));
			WebElement Login = driver.findElement(By.id("loginButton"));
			
			Actions act = new Actions(driver);
			/*act.sendKeys(UN, "admin").perform();
			act.sendKeys(PWD, "manager").perform();
			act.click(Login).perform();*/
			
			//act.sendKeys(UN,"admin").sendKeys(PWD,"manager").click(Login).perform();
			
//when performing multiple action in the same line sometimes we dont work that time we should use build method
			act.sendKeys(UN, "admin").sendKeys(PWD, "manager").click(Login).build().perform();
}
}
