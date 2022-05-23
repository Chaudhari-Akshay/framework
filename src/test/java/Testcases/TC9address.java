package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Address;
import resources.Baseclass;

public class TC9address extends Baseclass {
	public static Logger log=LogManager.getLogger(TC9address.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void Address1(){
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		Address ad=new Address(driver);
		System.out.println(ad.Address().getText());
		test.log(LogStatus.INFO,"Address of office is : "+	ad.Address().getText() );

		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}
}
