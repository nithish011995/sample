package POPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		
		Thread.sleep(2000);
		String mainid = driver.getWindowHandle();
		
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds)
		{
			if(!mainid.equals(id))
			{
				driver.switchTo().window(id);
				driver.findElement(By.xpath("//a[.='Watch the Videos']")).click();
			}
		}
		
	Thread.sleep(4000);
	String mainid2 = driver.getWindowHandle();
	Thread.sleep(4000);
		Set<String> allWin = driver.getWindowHandles();
		for(String id:allWin)
			
		{
			if(mainid2.equals(id))
				Thread.sleep(4000);
			{
				driver.switchTo().window(id);
		driver.findElement(By.linkText("Selenium: State of the Union - Diego Molina, Sauce Labs")).click();
			*not getting utube
			}
		}
}
}