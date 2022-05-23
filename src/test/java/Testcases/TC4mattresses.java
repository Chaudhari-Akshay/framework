package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.SelectMattresses;
import resources.Baseclass;

public class TC4mattresses extends Baseclass {
	public static Logger log=LogManager.getLogger(TC4mattresses.class.getName());
	
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void Mattresses() {
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		SelectMattresses sm=new SelectMattresses(driver);
		driver.manage().window().maximize();
		 Actions ac=new Actions(driver);
		 ac.moveToElement(sm.hoverMattresses()).build().perform();
		 test.log(LogStatus.INFO,"Hover on Mattresses" );
		
		sm.selectKingSize();
		test.log(LogStatus.INFO,"Selected king Size" );
		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
		
		extent.endTest(test);
	}
}
