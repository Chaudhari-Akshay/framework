package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage 
	{
	    WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
		@CacheLookup
		WebElement loginhover;
		
		@FindBy(xpath="//a[@class='login-link authentication_popup\']")
		@CacheLookup
		WebElement loginclk;
		
		public void loginHover()
		{
			driver.manage().window().maximize();
		//	Actions action=new Actions(driver);
			//action.moveToElement(loginhover);
			loginhover.click();
		}
		
		public void loginClk()
		{
			loginclk.click();
		}
		
}
