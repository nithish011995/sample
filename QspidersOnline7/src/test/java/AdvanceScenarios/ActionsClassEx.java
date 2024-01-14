package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Example for moveToElement()    ie. mouse(cuser) move to the particular element 
	
		driver.get("https://www.amazon.in/");
	WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
	Actions act = new Actions(driver);
	act.moveToElement(data).perform();
		
		//Actions methods---->sendkeys(),perform(),click(),build()
		
	/*	driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.id("username"));
		WebElement PWD = driver.findElement(By.name("pwd"));
		WebElement Login = driver.findElement(By.id("loginButton"));
		
		Actions act = new Actions(driver);
		act.sendKeys(UN,"admin").perform();
		act.sendKeys(PWD,"manager").perform();;
		act.click(Login).perform();
		//act.sendKeys(UN,"admin").sendKeys(PWD,"manager").click(Login).perform();//when performing multiple action in the same line sometimes we dont work that time we should use build method
	//	act.sendKeys(UN,"admin").sendKeys(PWD,"manager").click(Login).build().perform();
		
					//Action method---->contextClick()
				//right click on any particular element
		
		/*driver.get("https://www.amazon.in/");
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions act = new Actions(driver);
		act.contextClick(data).perform();*/
		
					//dragAnddrop method
		
	/*	driver.get("https:jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
		//another method for dragAndaction is clickAndHold and release   
		/*driver.get("https:jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(drag).perform();
		Thread.sleep(2000);
		act.release(drop).perform();*/
		
		
	}
}