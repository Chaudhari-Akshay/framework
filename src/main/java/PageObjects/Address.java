package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	WebDriver driver;
	
	 public  Address(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//li[@class='footer-link-font-small\']")
	 @CacheLookup
	 WebElement address;
	 
	 public WebElement Address()
	 {
		 
		 return address;
	 }
}
