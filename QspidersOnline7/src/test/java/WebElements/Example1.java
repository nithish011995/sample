package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
				//getCssValue()--->WebElement
		
		WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		String data = font.getCssValue("font-size");
		System.out.println(data);
	
		WebElement text = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		String color = text.getCssValue("color");
		System.out.println(color);
		
		
		
		
				//sendkeys(),submit(),click()
		
		//EX:1
		/*driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		search.sendKeys("puma");
	//	search.click(); //click action in not work for search and it only works for login
		search.submit();*/
		
		//EX:2
		/*driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]"));
		search.sendKeys("nike");
		search.submit();*/
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.cssSelector("input#username"));
		data.sendKeys("admin");
		Thread.sleep(3000);
		data.clear();*/
		
				//getLocation()--->WebElement
	/*	driver.get("https://www.facebook.com/");
		WebElement data = driver.findElement(By.xpath("//a[.='à²•à²¨à³�à²¨à²¡']"));//here .=text().....thist vissibleText()
		Point location = data.getLocation();
		System.out.println(location.x);
		System.out.println(location.y);
		
				//getSize()--->WebElement
		
	WebElement data2 = driver.findElement(By.xpath("//a[text()='à²•à²¨à³�à²¨à²¡']"));
		Dimension size = data2.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
						//getRect()--->WebElement
		
		WebElement data3 = driver.findElement(By.xpath("//a[text()='à²•à²¨à³�à²¨à²¡']"));
			Rectangle rect = data3.getRect();
			System.out.println(rect.getX());
			System.out.println(rect.getY());
			System.out.println(rect.getHeight());
			System.out.println(rect.getWidth());*/
			
				//isDisplayed()--->WebElement
		
	/*	driver.get("https://demo.actitime.com/login.do");
		WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
			
			if(logo.isDisplayed())
			{
				System.out.println("logo is displayed");
			}
			else {	
				System.out.println("logo is not displayed");
			}*/
		
				//isEnabled()--->WebElement
		
		/*driver.get("https://demo.actitime.com/login.do");
		
			WebElement username = driver.findElement(By.id("username"));//intentionally doing mistake
			
			if(username.isEnabled())
			{
				username.sendKeys("admin");
			}
			else {

				System.out.println("username is not enabled");// not enabled not understand
			}*/
		
					//isSelected()--->WebElement
		//EX:1
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (check.isSelected())
		{
			System.out.println("box is checked");
		}
		else {
			System.out.println("box is not checked");
		}*/
		
		//EX:2
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement check1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check1.click();
		if (check1.isSelected())
		{
			System.out.println("box is checked");
		}
		else {
			System.out.println("box is not checked");
		}*/
		
		//getTagName()--->WebElement
		
		//EX:1
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.name("username"));
			String name = data.getTagName();
			System.out.println(name);
	
			//EX:2
			driver.get("https://demo.actitime.com/login.do");
			WebElement data1 = driver.findElement(By.id("loginButton"));
				String name1 = data1.getTagName();
				System.out.println(name1);*/
	 	
		
				//getAriaRole()-----it is used find what type of WebElements
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.name("username"));
			String val = data.getAriaRole();
			System.out.println(val);
			
			WebElement check1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String val1 = check1.getAriaRole();
			System.out.println(val1);*/
			
					//DOM:-Document object model
						//getDomAttribute----used find attribute
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.name("username"));
		data.sendKeys("admin");
		System.out.println(data.getDomAttribute("id"));
		System.out.println(data.getDomAttribute("fyyjy"));*/
		
					//getDemoProperty-----used only for textField
	/*	driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.getDomProperty("class"));
		System.out.println(login.getDomProperty("id"));
				
		WebElement data = driver.findElement(By.id("username"));
		System.out.println(login.getDomProperty("class"));
		*/
				//getAttribute---for all the types(locators)
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.id("username"));
		System.out.println(data.getAttribute("class"));*/
		
					//getAccessibleName
		//used to capture the name of the element given in the top
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(1000);
		WebElement tasklink = driver.findElement(By.cssSelector("a.tasks"));//class=dot means using shortcut method
		System.out.println(tasklink.getAccessibleName());
		
		WebElement reportlink = driver.findElement(By.cssSelector("a[class=\"content reports\"]"));
		System.out.println(reportlink.getAccessibleName());*/
		
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"); 
		WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.getAccessibleName());*/
		
	}
}