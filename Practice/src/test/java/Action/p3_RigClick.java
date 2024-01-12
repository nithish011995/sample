package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p3_RigClick {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Action method---->contextClick()
	//right click on any particular element

	driver.get("https://www.amazon.in/");
	WebElement data = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions act = new Actions(driver);
	act.contextClick(data).perform();
	
}
}
