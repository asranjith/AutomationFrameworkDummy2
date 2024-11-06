package DataProviderConcepts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite got executed",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite got executed",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test got executed",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test got executed",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class got executed",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("After Class got executed",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println();
		Reporter.log("Before Method got executed",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method got executed",true);
		System.out.println();
	}
	@Test
	public void TestCase001() {
		Reporter.log("Test Case 001 got executed...",true);
	}
	@Test
	public void TestCase002() {
		Reporter.log("Test Case 002 got executed...",true);
	}

}
