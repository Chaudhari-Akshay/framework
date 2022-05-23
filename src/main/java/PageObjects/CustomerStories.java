package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerStories {

	WebDriver driver;
	
	 public CustomerStories(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@href='/reviews-testimonials?src=g_custstorwdgt\']")
	 @CacheLookup
	 WebElement clkstories;
	 
	 public void ViewallStories()
	 {
		 
		 clkstories.click();
	 }
	 @FindBy(xpath="//*[@id=\"content\"]/h1")
	 @CacheLookup
	 WebElement text;
	 
	 public WebElement Gettext()
	 {
		 
		 return text;
	 }

}
