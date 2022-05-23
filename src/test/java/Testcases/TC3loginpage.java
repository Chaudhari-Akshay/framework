package Testcases;

import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.LoginPage;
import resources.Baseclass;

public class TC3loginpage extends Baseclass {
	public static Logger log=LogManager.getLogger(TC3loginpage.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@Test
	public void loginpage()
	{
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		LoginPage lp=new LoginPage(driver);
		test.log(LogStatus.INFO,"Home page open successfully" );
		log.info("");
		
		lp.loginHover();
		test.log(LogStatus.INFO,"Login window open successfully" );
		
		lp.loginClk();
		test.log(LogStatus.INFO,"click on login btn successfully" );
		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
	
		extent.endTest(test);
	}

}
