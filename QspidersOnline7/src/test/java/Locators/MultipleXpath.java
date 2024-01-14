package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//And operator
		
		//htmltag[@AttributeNmae='AttributeValue' and @AttributeNmae='AttributeValue']
		
		driver.findElement(By.xpath("//input[@name='username' and @id='username']")).sendKeys("admin");
		
		
		//or operator
		
		//htmltag[@AttributeNmae='AttributeValue' or @AttributeNmae='AttributeValue']
		driver.findElement(By.xpath("//input[@placeholder='Password' or @id='pwd']")).sendKeys("manager");
	}

}
