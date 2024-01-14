package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//WebDriverManager.chromedriver().setup();
		 //Driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.amazon.com");		//get()-->used for launching WebApplication
		
		String title = driver.getTitle();			//get()-->used to get the title of the webpage
		System.out.println(title);
		
		String url = driver.getCurrentUrl();		//getcurrentUrl()-->used to get the url of the webApplication
		
		System.out.println(url);
	
		String data = driver.getPageSource();		//getOagrSource()-->used to print the sourcecode of the webPage
		System.out.println(data);
		
		//driver.close();			//close()-->closes only focused tab/windows
		
		//driver.quit();				//quit()-->close entire tabs
		
	}	
}
