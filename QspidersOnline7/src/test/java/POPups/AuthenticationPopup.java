package POPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {
public static void main(String[] args) {
	//WebDriver driver=new ChromeDriver();
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

	driver.manage().window().maximize();
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}

//where we need to handel the popup by giving the UN and PWD 
//where we need handel the popup
//which ask for the credemtials such type of popup are called authentication
//in the url itself we pass credential
//https://username:password@url