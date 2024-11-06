package LearnConfigAnnotationsWithBaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("===Database connection is Given===");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("===Database connection is Disconnected===");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("    ====Preconditions are Given====    ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("    ====Postconditions are Given====    ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("      =====Launching the Browser=====      ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("     =====Closing the Browser=====     ");
		System.out.println();
		System.out.println();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("        =====  Login  =====        ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("        =====  Logout  =====        ");
	}
}
