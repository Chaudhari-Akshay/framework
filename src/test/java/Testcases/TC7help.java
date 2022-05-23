package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Help;
import resources.Baseclass;

public class TC7help extends Baseclass{
	public static Logger log=LogManager.getLogger(TC7help .class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void Help1() {
		Help h=new Help(driver);
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		h.Clkhelp();
		test.log(LogStatus.INFO,"Clicked on Help" );
	
		h.SelectOquery();
		test.log(LogStatus.INFO,"My Order Query Selected" );
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		h.SelectQuestion().click();
		test.log(LogStatus.INFO,"Selected first Question"+h.SelectQuestion().getText());
		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}
}
