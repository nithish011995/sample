package POPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("//input[@id='file-upload']"));
		data.sendKeys("D:\\My docum\\English 1 std");
		file uploading is not done
	}
}

