package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	//Declaration
	@FindBy(id="username")
	private WebElement UserTextField;
	
	@FindBy(name="pwd")
	private WebElement PassWordTextField;
	
	@FindBy(className="initial")
	private WebElement LoginButton;
	
	//getter methods

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	//Business Logics
	
	public void logToApplication(String username,String password)
	{
		UserTextField.sendKeys(username);
		PassWordTextField.sendKeys(password);
		LoginButton.click();
	}

	
	




}
