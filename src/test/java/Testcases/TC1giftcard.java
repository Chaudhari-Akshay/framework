package Testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.Utilities.ExtentReport;
import com.relevantcodes.extentreports.LogStatus;

import PageObjects.GiftCard;
import resources.Baseclass;


public class TC1giftcard extends Baseclass {
	
	public static Logger log=LogManager.getLogger(TC1giftcard.class.getName());
	

	
@BeforeTest
public void btest() throws IOException{

	driver=InitializeDriver();

	driver.get(prop.getProperty("url"));
	
	
}
	
@Test
public void giftCard()
{
	
	test.log(LogStatus.INFO,"Driver Initialized" );
	test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
	GiftCard gc=new GiftCard(driver);
test.log(LogStatus.INFO,"home page open successfully" );
	
	
	gc.clkGiftCard();
	test.log(LogStatus.INFO,"click on gift card successfully" );

	
	gc.selectGiftCard();
	test.log(LogStatus.INFO,"select gift card successfully" );

	
	gc.selectAmount();
	test.log(LogStatus.INFO,"select amount successfully" );
	
	
	gc.selectNext();
	test.log(LogStatus.INFO,"click on next button successfully" );

	test.log(LogStatus.PASS,"Test Passed");
}

	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
		extent.endTest(test);
	}

}
