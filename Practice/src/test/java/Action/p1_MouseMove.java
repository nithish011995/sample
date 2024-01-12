package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1_MouseMove {

	//Example for moveToElement()    ie. mouse(cuser) move to the particular element 

	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	WebElement data = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
	Actions act = new Actions(driver);
	act.moveToElement(data).perform();
	
	
}
}
