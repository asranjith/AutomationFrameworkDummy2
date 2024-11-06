package com.CRM.BaseClass;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.CRM.Generic.DataUtilityTest.DatabaseUtility;
import com.CRM.Generic.FileUtilityTest.ExcelUtility;
import com.CRM.Generic.FileUtilityTest.FileUtility;
import com.CRM.Generic.WebDriverUtilityTest.JavaUtility;
import com.CRM.Generic.WebDriverUtilityTest.UtilityClassObject;
import com.CRM.Generic.WebDriverUtilityTest.WebDriverUtility;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.LoginPage;

public class BaseClassForCRM {

	public WebDriver driver;
	public static WebDriver sdriver;	
	public FileUtility file = new FileUtility();
	public ExcelUtility Excel = new ExcelUtility();
	public WebDriverUtility wu = new WebDriverUtility();
	public JavaUtility j = new JavaUtility();
	public DatabaseUtility db = new DatabaseUtility();

	@BeforeSuite(groups = { "smoke", "regression" })
	public void beforeSuite() {
		System.out.println("===Database connection is Given===");
		db.getConnection();

	}

	@BeforeTest(groups = { "smoke", "regression" })
	public void beforeTest() {
		System.out.println("    ====Preconditions are Given====    ");
	}

	@Parameters("Browser") // It returns value which present in the Xml file....
	@BeforeClass(groups = { "smoke", "regression" })
	public void beforeClass(@Optional("chrome") String Browser) throws IOException {
		System.out.println("      =====Launching the Browser=====      ");
		String BROWSER = Browser;
		//String BROWSER = file.getDataFromPropFile("browser");
		driver = wu.toLaunchBrowser(driver, BROWSER);
		wu.maximize(driver);
		wu.waitForPageLoad(driver, 20);
		sdriver=driver;
		UtilityClassObject.setDriver(driver);

	}

	@BeforeMethod(groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		System.out.println("        =====  Login  =====        ");

		String URL = file.getDataFromPropFile("url");
		String PASSWORD = file.getDataFromPropFile("password");
		String USERNAME = file.getDataFromPropFile("username");
		wu.url(driver, URL);
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

	}

	@AfterMethod(groups = { "smoke", "regression" })
	public void afterMethod() {
		HomePage hp = new HomePage(driver);
		hp.logout(driver);
		System.out.println("        =====  Logout  =====        ");
	}

	@AfterClass(groups = { "smoke", "regression" })
	public void afterClass() {
		driver.quit();
		System.out.println("     =====Closing the Browser=====     ");
	}

	@AfterTest(groups = { "smoke", "regression" })
	public void afterTest() {
		System.out.println("    ====Postconditions are Given====    ");
	}

	@AfterSuite(groups = { "smoke", "regression" })
	public void afterSuite() throws SQLException {
		db.closeConnection();
		System.out.println("===Database connection is Disconnected===");

	}
}
