package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Help {
	 WebDriver driver;
		
	 public Help(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@href='/help\']")
	 @CacheLookup
	 WebElement clkhelp;
	 
	 public void Clkhelp()
	 {
		 
		 clkhelp.click();
	 }

	 
	 @FindBy(xpath="//a[@href='/help/my-order-queries\']")
	 @CacheLookup
	 WebElement sltmo;
	 
	 public void SelectOquery()
	 {
		 
		sltmo.click();
	 }
	 
	 @FindBy(xpath="(//li[@class='entry\'])[1]")
	 @CacheLookup
	 WebElement question;
	 
	 public WebElement SelectQuestion()
	 {
		 
		 return question;
		
	 }
	 
	 
}
