package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class GoStores 
	{
		 WebDriver driver;
			
		 public GoStores(WebDriver driver)
		 {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 
		 @FindBy(xpath="//a[@href='../../furniture-stores?src=header\']")
		 @CacheLookup
		 WebElement clkstore;
		 
		 public void clkStore()
		 {
			 driver.manage().window().maximize();
			 clkstore.click();
		 }
		
		 @FindBy(xpath="(//div[@class=\'_12wcw\'])[1]")
		 @CacheLookup
		 WebElement selectstore;
		 
		 public void selectStore()
		 {
			 selectstore.click();
		 }
		 
		 
		 @FindBy(xpath="(//button[@class=\'_1fVSi action-button _1njbS _1XfDi _3J6Eb\'])[1]")
		 @CacheLookup
		 WebElement viewdetail;
		 
		 public void viewDetail()
		 {
			 viewdetail.click();
		 }
}
