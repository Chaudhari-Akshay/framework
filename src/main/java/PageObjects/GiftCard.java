package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard 
{
	WebDriver driver;
	
	 public GiftCard(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@href='../../gift-cards?src=header\']")
	 @CacheLookup
	 WebElement clkgiftcard;
	 
	 public void clkGiftCard()
	 {
		 driver.manage().window().maximize();
		 clkgiftcard.click();
	 }
	 
	 @FindBy(className="_2ebST")
	 @CacheLookup
	 WebElement selectgiftcard;
	 
	 public void selectGiftCard()
	 {
		 selectgiftcard.click();
	 }
	 
	 @FindBy(xpath="//*[@id=\'app-container\']/div/main/section/section[2]/div/section[2]/div[1]/button[1]")
	 @CacheLookup
	 WebElement selectamount;
	 
	 public void selectAmount()
	 {
		 selectamount.click();
	 }
	 
	 @FindBy(xpath="//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	 @CacheLookup            
	 WebElement selectnext;
	 
	 public void selectNext()
	 {
		 selectnext.click();
	 }

}

