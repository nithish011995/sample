package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	FileInputStream fis = new FileInputStream("./common.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	 String URL = pro.getProperty("url2");
	 driver.get(URL);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
}
}
