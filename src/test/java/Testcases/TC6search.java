package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Search;
import resources.Baseclass;

public class TC6search extends Baseclass {

	
	public static Logger log=LogManager.getLogger(TC6search.class.getName());
	@BeforeTest
	public void btest() throws IOException{

		driver=InitializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void search() {
		Search s=new Search(driver);
		test.log(LogStatus.INFO,"Driver Initialized" );
		test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
		s.Searchbox().sendKeys("Study Table");
		test.log(LogStatus.INFO,"Text entered in searchbox" );
	
		s.Searchbtn();
		test.log(LogStatus.INFO,"Clicked on search button" );
		test.log(LogStatus.PASS,"Test Passed");
	}
	@AfterTest
	public void aftest() {

		driver.close();
		test.log(LogStatus.INFO,"Driver Closed" );
		extent.endTest(test);
	}
}
