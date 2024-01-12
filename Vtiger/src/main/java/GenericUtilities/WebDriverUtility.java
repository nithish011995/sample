package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consists of all the re usable methods related to web driver actions  
 * @author Nithish
 *
 */
public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) //update driver reference
	{
			driver.manage().window().maximize(); 
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method will wait for all the findElement and findElements
	 * operation to be performed
	 * @param driver
	 */
	public void waitForElementsToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method will wait until the specified element is visible in DOM
	 * @param driver
	 * @param element
	 */
	public void waitForElementsToVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will handle drop down using index
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method will handle drop down using value
	 * @param element
	 * @param value
	 */
	public void handleDropDown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This method will handle dropDown using visible text
	 * @param text
	 * @param element
	 */
	public void handleDropDown(String text,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will perform mouse Hover action on a target element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver,WebElement element) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();;
	}
	
	/**
	 * This method will double click anywhere on the web page
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver) 
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	 /**
	  * This method will double click on a web element
	  * @param driver
	  * @param element
	  */
		public void doubleClickAction(WebDriver driver,WebElement element) 
		{
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
		}
		
		/**
		 * This method will right click anywhere on the web page
		 * @param driver
		 */

		public void rightClickAction(WebDriver driver) 
		{
			Actions act = new Actions(driver);
			act.contextClick().perform();
		}
		
		
		/**
		 * This method will right click on a particular web element
		 * @param driver
		 * @param element
		 */
	
		public void rightClickAction(WebDriver driver,WebElement element) 
		{
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
		}
		
		/**
		 * This method will perform drag and drop action
		 * @param driver
		 * @param srcElement
		 * @param targetElement
		 */
		public void dragAndDropAction(WebDriver driver,WebElement srcElement,WebElement targetElement)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(srcElement, targetElement).perform();
		}
		
		/**
		 * This method is used to move the cursor anywhere on the web page based on offset values
		 * @param driver
		 * @param xOffset
		 * @param yOffset
		 */
		public void moveAcrossWebPage(WebDriver driver,int xOffset,int yOffset) 
		{
			Actions act = new Actions(driver);	
			act.moveByOffset(xOffset, yOffset).click().perform();
		}
		
		/**
		 * This method will scroll vertically for 500 pixels
		 * @param driver
		 */
		public void scrollAction(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500);", "");
		}
		
		/**
		 * This method will scroll vertically until the element reference
		 * @param driver
		 * @param element
		 */
		public void scrollAction(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			int y=element.getLocation().getY();
			js.executeScript("window.scrollBy(0,"+y+");",element);
		
			//js.executeScript("argument[0].scrollIntoView();", element);
		}
		
		
		/**
		 * This method will cancel the confirmation pop up
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		
		/**
		 * This method will enter the text in prompt pop up
		 * @param driver
		 */
		public void sendTextToAlert(WebDriver driver,String text)
		{
			driver.switchTo().alert().sendKeys(text);
		}
		
		/**
		 * This method will capture the alert message and return to the caller
		 * @param driver
		 * @param text
		 */
		public void getAlertText(WebDriver driver,String text)
		{
			driver.switchTo().alert().getText();
		}
		
		/**
		 * This method will handle frame based on frame index
		 * @param driver
		 * @param index
		 */
		public void handleFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		
		/**
		 * This method will handle frame based on value of name or ID attributes
		 * @param driver
		 * @param nameOrID
		 */
		public void handleFrame(WebDriver driver,String nameOrID)
		{
			driver.switchTo().frame(nameOrID);
		}
		
		/**
		 * This method will handle frame based on web element
		 * @param driver
		 * @param element
		 */
		public void handleFrame(WebDriver driver,WebElement element)
		{
			driver.switchTo().frame(element);
		}
		
		/**
		 * This method will help to switch the control back to immediate parent
		 * @param driver
		 */
			public void switchToParentFrame(WebDriver driver)
			{
				driver.switchTo().parentFrame();
			}
		
		/**
		 *  This method will help to switch the control back to current page
		 * @param driver
		 */
			public void switchToDefaultPage(WebDriver driver)
			{
				driver.switchTo().defaultContent();
			}
		
		/**
		 * This method will switch the selenium control from parent to child or 
		 * child to parent 
		 * @param driver
		 * @param partialWinTitle
		 */
		
		public void switchToWindow(WebDriver driver,String partialWinTitle)
		{
			//step1:capture all the windows IDs
			Set<String> allWindows = driver.getWindowHandles();
			
			//step2:iterate through individual IDs   //3 window ids
			for(String winID:allWindows)
			{
				//Step3:switch to each ID and capture the title
				String currentTitle = driver.switchTo().window(winID).getTitle();
			
				//step4:compare the title with required reference
				if(currentTitle.contains(partialWinTitle))
				{
					break;
				}
			
			}
		}
		
	/**
	 * This method will take screen shot and return the absolute path of it
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws Throwable
	 */
	public String takeScreenShot(WebDriver driver,String screenshotName) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\ScreenShots\\"+screenshotName+".png");
		Files.copy(src, dst);;//this class is coming from IO tool
		return dst.getAbsolutePath();	//attach the screen shot to extent reports
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
