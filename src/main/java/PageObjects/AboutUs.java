package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
WebDriver driver;
	
	public AboutUs(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/about-urban-ladder?src=g_footer\']")
	WebElement aboutus;
	
	public void AboutUs1(){
		 aboutus.click();;
	}
	
			@FindBy(xpath="//p[@class='answer aboutus_answer\']")
			WebElement abtdetail;
			
			public WebElement Abtdetail(){
				 return abtdetail;
			}
}
