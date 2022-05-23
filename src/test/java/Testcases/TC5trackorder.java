package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.TrackOrder;
import resources.Baseclass;

public class TC5trackorder extends Baseclass {
	public static Logger log=LogManager.getLogger(TC5trackorder.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void trackorder() {
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		// driver.manage().window().maximize();
		 TrackOrder to=new TrackOrder(driver);
	to.trackorders();
	test.log(LogStatus.INFO,"Clicked on track order" );

	to.Orderno().sendKeys("12345678");
	test.log(LogStatus.INFO,"Order no entered" );
	to.Phoneno().sendKeys("8888888999");
	test.log(LogStatus.INFO,"Mobile no entered" );
	to.Nextbtn();
	test.log(LogStatus.INFO,"clicked on next button" );
	test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}
	
}
