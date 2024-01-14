package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEx {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("\"https://www.naukri.com/\"");
	/*driver.get("https://www.flipkart.com");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement data = driver.findElement(By.xpath("//img[@alt='McFARLANE 30155']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", data);
		data.click();
*/
		

}
}
