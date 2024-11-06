package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ContactInfoPage {

	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ElementText;

	@FindBy(id = "dtlview_Last Name")
	private WebElement LastName;

	@FindBy(id = "dtlview_First Name")
	private WebElement FirstName;

	@FindBy(id = "dtlview_Office Phone")
	private WebElement OfficeNum;

	@FindBy(id = "dtlview_Mobile")
	private WebElement MobileNum;

	@FindBy(id = "dtlview_Home Phone")
	private WebElement HomeNum;

	@FindBy(id = "dtlview_Other Phone")
	private WebElement AlterNum;

	@FindBy(id = "dtlview_Fax")
	private WebElement Fax;

	@FindBy(id = "dtlview_Title")
	private WebElement Title;

	@FindBy(id = "dtlview_Department")
	private WebElement Department;

	@FindBy(id = "dtlview_Email")
	private WebElement Email;

	@FindBy(id = "dtlview_Assistant")
	private WebElement AssistantName;

	@FindBy(id = "dtlview_Assistant Phone")
	private WebElement AssistantNum;

	@FindBy(id = "dtlview_Secondary Email")
	private WebElement SecondaryMail;

	@FindBy(id = "dtlview_Support Start Date")
	private WebElement StartDate;

	@FindBy(id = "dtlview_Support End Date")
	private WebElement EndDate;

	// Getters
	public WebElement getElementText() {
		return ElementText;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getOfficeNum() {
		return OfficeNum;
	}

	public WebElement getMobileNum() {
		return MobileNum;
	}

	public WebElement getHomeNum() {
		return HomeNum;
	}

	public WebElement getAlterNum() {
		return AlterNum;
	}

	public WebElement getFax() {
		return Fax;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getDepartment() {
		return Department;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getAssistantName() {
		return AssistantName;
	}

	public WebElement getAssistantNum() {
		return AssistantNum;
	}

	public WebElement getSecondaryMail() {
		return SecondaryMail;
	}

	public WebElement getStartDate() {
		return StartDate;
	}

	public WebElement getEndDate() {
		return EndDate;
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

	public void verifyLastName(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(LastName.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (LastName.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}

	public void verifyFirstName(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(FirstName.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (FirstName.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	public void verifyMobileNum(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(MobileNum.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (MobileNum.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyOfficeNum(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(OfficeNum.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (OfficeNum.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyHomeNum(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(HomeNum.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (HomeNum.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyFax(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Fax.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (Fax.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyTitle(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Title.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (Title.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyDepartment(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Department.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (Department.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyEmail(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Email.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (Email.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifySecondaryMail(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SecondaryMail.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (SecondaryMail.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyAssistant(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(AssistantName.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
//		if (AssistantName.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyAssistantNum(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(AssistantNum.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
		
//		if (AssistantNum.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyStartDate(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(StartDate.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
		
//		if (StartDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}
	
	public void verifyEndDate(String value) {
		
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(EndDate.getText(), value, value + " is not added");
		soft.assertAll();
		System.out.println(value + " is added");
		
//		if (EndDate.getText().equals(value)) {
//			System.out.println(value + " is added");
//		} else {
//			System.out.println(value + " is not added");
//		}
	}

}
