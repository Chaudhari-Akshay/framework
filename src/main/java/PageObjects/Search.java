package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	
WebDriver driver;
	
	public Search(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search")
	WebElement searchbox;
	
	public WebElement Searchbox(){
		return searchbox;
	}
	
	@FindBy(id="search_button")
	WebElement searchbtn;
	
	public void Searchbtn(){
		 searchbtn.click();
	}
}
