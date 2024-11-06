package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ServicesInfoPage {

	public ServicesInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement ElementText;

	@FindBy(id = "dtlview_Service Name")
	private WebElement ServiceName;

	@FindBy(id = "dtlview_Website")
	private WebElement Website;

	@FindBy(id = "dtlview_No of Units")
	private WebElement UnitQty;

	@FindBy(id = "dtlview_Category")
	private WebElement Category;

	@FindBy(id = "dtlview_Sales Start Date")
	private WebElement SalesStartDate;

	@FindBy(id = "dtlview_Sales End Date")
	private WebElement SalesEndDate;
	
	@FindBy(id = "dtlview_Support Start Date")
	private WebElement SupportStartDate;

	@FindBy(id = "dtlview_Support Expiry Date")
	private WebElement SupportExpiryDate;
	
	//Getters	

	public WebElement getElementText() {
		return ElementText;
	}

	public WebElement getServiceName() {
		return ServiceName;
	}

	public WebElement getWebsiteName() {
		return Website;
	}

	public WebElement getUnitQty() {
		return UnitQty;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getSalesStartDate() {
		return SalesStartDate;
	}

	public WebElement getSalesEndDate() {
		return SalesEndDate;
	}

	public WebElement getSupportStartDate() {
		return SupportStartDate;
	}

	public WebElement getSupportExpiryDate() {
		return SupportExpiryDate;
	}

	
	
	//Business Methods
	public void verifyPage(String Value) {
	
		
		boolean status = ElementText.getText().contains(Value);
		Assert.assertEquals(status, true,Value+" is not added to Database");
		System.out.println(Value+" is added to Database");

//		if ((ElementText.getText()).contains(Value)) {
//
//			System.out.println(Value + " is added to Database");
//		} else {
//			System.out.println(Value + " is not added to Database");
//		}
	}

	public void verifyServiceName(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(ServiceName.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");

//		if (ServiceName.getText().equalsIgnoreCase(value)) {
//			System.out.println("Organization is created");
//		} else {
//			System.out.println("Organization is not created");
//
//		}
	}

	public void verifyCategory(String Value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Category.getText(), Value,Value+" is not added");
		soft.assertAll();
		System.out.println(Value+" is added");
//		if (Category.getText().equalsIgnoreCase(Value)) {
//			System.out.println(Value + " is added...");
//		} else {
//			System.out.println(Value + " is not added...");
//		}

	}

	public void verifyWebsite(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Website.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");

//		if (Website.getText().equalsIgnoreCase(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}

	public void verifyUnitQty(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(UnitQty.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (UnitQty.getText().equalsIgnoreCase(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}
	
	public void verifySalesStartDate(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SalesStartDate.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (SalesStartDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifySalesEndDate(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SalesEndDate.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (SalesEndDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifySupportStartDate(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SupportStartDate.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (SupportStartDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifySupportExpiryDate(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SupportExpiryDate.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (SupportExpiryDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}

}
