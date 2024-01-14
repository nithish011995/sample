package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {			//selenium 16
	
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		
				// for version 4
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demo.actitime.com/login.do");
		

		// for version 3
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://demo.actitime.com/login.do");
		
		//another method
		
		//syntax
		Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		
		//time.implicitlyWait(Duration.ofSeconds(10));//version 4
		
		time.implicitlyWait(20,TimeUnit.SECONDS);//version 3
		driver.get("https://demo.actitime.com/login.do");
	
}
}//implicitwaits used only once in the script that is after launching the browser

//in implicit waits navu 10seconds kotidre hadu program just 2 seconds hale run hadre 
//ina 8 seconds hadu wait madala 

//but Thread.Sleep hali 10 seconds thanaka nu wait maduthae program 2 seconds ge 
//run hadru so 8 seconds time waste

