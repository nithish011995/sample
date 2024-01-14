package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElement {
 //selenium=12
	
	//svg:-Scalable vector Graphics
	//syntax:-//*[name()='svg']
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	//driver.findElement(By.xpath("//*[name()='svg' and @ class='gb_h']")).click();
	driver.findElement(By.cssSelector("svg[class='gb_h']")).click();
}
}