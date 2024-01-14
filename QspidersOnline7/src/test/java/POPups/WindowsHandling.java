package POPups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
	Actions act = new Actions(driver);
	act.moveToElement(jobs).perform();
			
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[.='Jobs by skill']")).click();////div[text()='Jobs by skill']....tect()=.
	
	driver.findElement(By.xpath("//div[.='Services']")).click();

	//driver.findElement(By.xpath("//span[.='FIND JOBS']")).click();//this will not perform because driver till focus in 1st window but this action in 2nd window
	//so switch to 2nd window
	String mainid = driver.getWindowHandle();
	System.out.println(mainid);
	
	Set<String> allids = driver.getWindowHandles();
	System.out.println(allids);
	
	for(String id:allids)
	{
		if (!mainid.equals(id))
		{
			driver.switchTo().window(id);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[.='FIND JOBS']")).click();
		}
	}
	//driver.switchTo().window(mainid);//switch back to the main window(1st window) or
	//driver.close();//2nd tab or child tab will close
	driver.quit();//both tabs will close
	}

}
