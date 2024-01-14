package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByRobot {		//16
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);




}
}