package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.GoStores;
import resources.Baseclass;

public class TC2gostore extends Baseclass{
	public static Logger log=LogManager.getLogger(TC2gostore.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void stores()
	{
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
	   GoStores gc=new GoStores(driver);
	   test.log(LogStatus.INFO,"home page open successfully" );
	   
	   
	   gc.clkStore();
	   test.log(LogStatus.INFO,"clicked on store  successfully" );
	   log.info("");
	   
	   
	   gc.viewDetail();
	   test.log(LogStatus.INFO,"view details of first store  open successfully" );
	   
	   test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}
}
