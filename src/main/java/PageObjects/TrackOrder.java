package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrder  {
	
	WebDriver driver;
	
	 public TrackOrder(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@href='/orders\']")
	 @CacheLookup
	 WebElement trackorders;
	 
	 public void trackorders()
	 {
		 driver.manage().window().maximize();
		 trackorders.click();
	 }
	 
	 
	 @FindBy(id="ip_379403698")
	 @CacheLookup
	 WebElement orderno;
	 
	 public WebElement Orderno()
	 {
		 return orderno; 
	 }
	 
	 
	 @FindBy(id="ip_394711104")
	 @CacheLookup
	 WebElement phoneno;
	 
	 public WebElement Phoneno()
	 {
		 return phoneno; 
	 }
	 
	 @FindBy(xpath="//button[@class='_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9']")
	 @CacheLookup
	 WebElement nextbtn;
	 
	 public void Nextbtn()
	 {
		 nextbtn.click();
	 }
}
