package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMattresses {
	WebDriver driver;
	
	 public SelectMattresses(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//li[@class='topnav_item mattressesunit']")
	 @CacheLookup
	
	 WebElement hovermattresses;
	 
	 @FindBy(xpath="//a[@href='/king-size-mattress?src=g_topnav_mattresses_mattresses-bedding_king-size-mattress']")
	 @CacheLookup
	 WebElement selectkingsize;
	 
	 
	 public WebElement hoverMattresses()
	 {
		 
		return hovermattresses;
	 }
	 
	 public void selectKingSize()
	 {
		 selectkingsize.click();
	 }

}
