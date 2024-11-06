package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductInfoPage {

	public ProductInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement ElementText;

	@FindBy(id = "dtlview_Part Number")
	private WebElement PartNumber;
	
	@FindBy(id = "dtlview_Product Name")
	private WebElement PartName;

	@FindBy(id = "dtlview_Sales Start Date")
	private WebElement SalesStartDate;

	@FindBy(id = "dtlview_Sales End Date")
	private WebElement SalesEndDate;

	@FindBy(id = "dtlview_Manufacturer")
	private WebElement Manufacturer;

	@FindBy(id = "dtlview_Product Category")
	private WebElement Category;

	@FindBy(id = "dtlview_Support Start Date")
	private WebElement SupportStartDate;

	@FindBy(id = "dtlview_Support Expiry Date")
	private WebElement SupportExpiryDate;

	@FindBy(id = "dtlview_Website")
	private WebElement Website;

	
	// Getters
	public WebElement getElementText() {
		return ElementText;
	}

	public WebElement getPartNumber() {
		return PartNumber;
	}
	public WebElement getPartName() {
		return PartName;
	}

	public WebElement getSalesStartDate() {
		return SalesStartDate;
	}

	public WebElement getSalesEndDate() {
		return SalesEndDate;
	}

	public WebElement getManufacturer() {
		return Manufacturer;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getSupportStartDate() {
		return SupportStartDate;
	}

	public WebElement getSupportExpiryDate() {
		return SupportExpiryDate;
	}

	public WebElement getWebsite() {
		return Website;
	}


	// Business Methods

	public void verifyPage(String Value) {
		
		
		boolean status = ElementText.getText().contains(Value);
		Assert.assertEquals(status,true,Value + " is not added to Database");
		System.out.println(Value + " is added to Database");
//		if ((ElementText.getText()).contains(Value)) {
//
//			System.out.println(Value + " is added to Database");
//		} else {
//			System.out.println(Value + " is not added to Database");
//		}
	}

	
	public void verifyPartNumber(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(PartNumber.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (PartNumber.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}

	public void verifyPartName(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(PartName.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (PartName.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	public void verifyCategory(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Category.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Category.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyManufacturer(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Manufacturer.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Manufacturer.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
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
	
	public void verifyWebsite(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Website.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Website.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}

}
