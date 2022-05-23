package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.CustomerStories;
import resources.Baseclass;

public class TC8cutomerStory extends Baseclass {
	
		public static Logger log=LogManager.getLogger(TC8cutomerStory.class.getName());
		@BeforeTest
		public void btest() throws IOException{

			driver=InitializeDriver();
		
			driver.get(prop.getProperty("url"));
			
			
		}
		@Test
		public void CustomerStory() {
			test.log(LogStatus.INFO,"Driver Initialized" );
			test.log(LogStatus.INFO,"the current url of the web page :: "+prop.getProperty("url"));
			CustomerStories cs=new CustomerStories(driver);
			
			cs.ViewallStories();
			test.log(LogStatus.INFO,"Clicked on View all Stories" );
			cs.Gettext().getText();
			System.out.println(cs.Gettext().getText());
			Assert.assertEquals(cs.Gettext().getText(), "Customer Stories");
			test.log(LogStatus.INFO,"Test Dispayed :"+ cs.Gettext().getText());
			test.log(LogStatus.PASS,"Test Passed");
		}
		@AfterTest
		public void aftest() {

			driver.close();
			test.log(LogStatus.INFO,"Driver Closed" );
		
			extent.endTest(test);
		}
}
