package POPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		
		Set<String> AllIds = driver.getWindowHandles();
		
		for(String id:AllIds) {
			driver.switchTo().window(id);
		String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Selenium"))
				{
					break;
				}
		}
		driver.findElement(By.xpath("//a[.='Watch the Videos']")).click();
		
		/*//to switch back to main window
		Set<String> allWin = driver.getWindowHandles();
		
		for(String id:allWin)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows"))
				break;
		}
	*/
Set<String> allWin = driver.getWindowHandles();
		
		for(String id:allWin)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("SeleniumConf Chicago 2023 Playlist - YouTube"))
				break;
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Q&A with the Selenium Committer's Panel - moderated by Noemi Ferrera")).click();
	}

}
