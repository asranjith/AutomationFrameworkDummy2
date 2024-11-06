package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class OrganisationInfoPage {

	public OrganisationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ElementText;

	@FindBy(id = "dtlview_Organization Name")
	private WebElement OrgName;

	@FindBy(id = "dtlview_Website")
	private WebElement WebsiteName;

	@FindBy(id = "id=dtlview_Ticker Symbol")
	private WebElement TickerSymbol;

	@FindBy(id = "dtlview_Employees")
	private WebElement Employees;

	@FindBy(id = "dtlview_Industry")
	private WebElement IndustryName;

	@FindBy(id = "dtlview_Type")
	private WebElement TypeName;

	@FindBy(id = "dtlview_Phone")
	private WebElement PhoneNum;

	@FindBy(id = "dtlview_Fax")
	private WebElement FaxNum;

	@FindBy(id = "dtlview_Other Phone")
	private WebElement AlternateNum;

	@FindBy(id = "dtlview_Email")
	private WebElement EmailId;

	@FindBy(id = "dtlview_Ownership")
	private WebElement OwnerName;

	public WebElement getElementText() {
		return ElementText;
	}

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getWebsiteName() {
		return WebsiteName;
	}

	public WebElement getTickerSymbol() {
		return TickerSymbol;
	}

	public WebElement getEmployees() {
		return Employees;
	}

	public WebElement getIndustryName() {
		return IndustryName;
	}

	public WebElement getTypeName() {
		return TypeName;
	}

	public WebElement getPhoneNum() {
		return PhoneNum;
	}

	public WebElement getFaxNum() {
		return FaxNum;
	}

	public WebElement getAlternateNum() {
		return AlternateNum;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getOwnerName() {
		return OwnerName;
	}

	public void verifyPage(String Value) {
		
		boolean Status = ElementText.getText().contains(Value);
		
		Assert.assertEquals(Status, true,Value + " is not added to Database");
		System.out.println(Value + " is added to Database");
//		if ((ElementText.getText()).contains(Value)) {
//
//			System.out.println(Value + " is added to Database");
//		} else {
//			System.out.println(Value + " is not added to Database");
//		}
	}

	public void verifyOrgName(String value) {
		
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(OrgName.getText(), value, "Organization is created");
		soft.assertAll();
		System.out.println("Organization is created");
		
//		if (OrgName.getText().equalsIgnoreCase(value)) {
//			System.out.println("Organization is created");
//		} else {
//			System.out.println("Organization is not created");
//
//		}
	}

	public void verifyIndustry(String Value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(IndustryName.getText(), Value, Value + " is not added...");
		soft.assertAll();
		System.out.println(Value + " is added...");
		
//		if (IndustryName.getText().equalsIgnoreCase(Value)) {
//			System.out.println(Value + " is added...");
//		} else {
//			System.out.println(Value + " is not added...");
//		}

	}

	public void verifyType(String value) {

		SoftAssert soft=new SoftAssert();
		soft.assertEquals(TypeName.getText(), value, value + " is not added...");
		soft.assertAll();
		System.out.println(value + " is added...");
		
//		if (TypeName.getText().equalsIgnoreCase(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}

	public void verifyContact(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(PhoneNum.getText(), value, value + " is not added...");
		soft.assertAll();
		System.out.println(value + " is added...");

//		if (PhoneNum.getText().equalsIgnoreCase(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}

}
