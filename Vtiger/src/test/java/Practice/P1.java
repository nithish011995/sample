package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class P1 {
	
	@Test
	
public  void p1() {
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	System.out.println("pass");
	driver.close();
	
	driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	System.out.println("kabaddi");
	driver.close();
	
	driver=new EdgeDriver();
	driver.get("https://www.udemy.com/");
	System.out.println("dont give up");
	
	
}
}
