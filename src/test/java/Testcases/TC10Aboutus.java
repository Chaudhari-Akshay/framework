package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AboutUs;
import resources.Baseclass;

public class TC10Aboutus extends Baseclass{
	public static Logger log=LogManager.getLogger(TC10Aboutus.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void About(){
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		AboutUs au=new AboutUs(driver);
		au.AboutUs1();
		test.log(LogStatus.INFO,"clicked on about us" );
		
		au.Abtdetail().getText();
		System.out.println(au.Abtdetail().getText());
		
		test.log(LogStatus.INFO,"About Us :"+au.Abtdetail().getText() );
		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}

}
