package Frames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage;

public class Properties_File {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./propertiesData.properties2.txt");
		//FileInputStream fis = new FileInputStream("./propertiesData.properties.txt");
		//FileInputStream fis = new FileInputStream("./common.properties.txt");
		//FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\propertiesData.properties");
		//FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\common.properties");
		//FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\propertiesData.properties2");
		Properties pro = new Properties();
		pro.load(fis);
		 String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		 
		 driver.get(URL);
	//	 LoginPage login = new LoginPage(driver);
	//	 login.logToApplication(USERNAME, PASSWORD);
		 driver.findElement(By.name("username")).sendKeys(USERNAME);
		 driver.findElement(By.name("pwd")).sendKeys(PASSWORD); 
		 driver.findElement(By.className("initial")).click();
	}

}
