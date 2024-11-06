package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LeadsInfoPage {

	public LeadsInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ElementText;

	@FindBy(id = "dtlview_First Name")
	private WebElement FirstName;

	@FindBy(id = "dtlview_Website")
	private WebElement WebsiteName;

	@FindBy(id = "dtlview_Last Name")
	private WebElement LastName;

	@FindBy(id = "dtlview_Employees")
	private WebElement Employees;

	@FindBy(id = "dtlview_Company")
	private WebElement Company;
	
	@FindBy(id = "dtlview_Lead Source")
	private WebElement LeadSource;
	@FindBy(id = "dtlview_Industry")
	private WebElement Industry;

	@FindBy(id = "dtlview_Lead Status")
	private WebElement LeadStatus;

	@FindBy(id = "dtlview_Rating")
	private WebElement Rating;

	@FindBy(id = "dtlview_Title")
	private WebElement Title;

	@FindBy(id = "dtlview_Phone")
	private WebElement PhoneNum;

	@FindBy(id = "dtlview_Fax")
	private WebElement Fax;

	@FindBy(id = "dtlview_Mobile")
	private WebElement MobileNum;

	@FindBy(id = "dtlview_Email")
	private WebElement EmailId;
	
	@FindBy(id = "dtlview_Secondary Email")
	private WebElement SecondaryMail;

	@FindBy(id = "dtlview_Ownership")
	private WebElement OwnerName;
	
	

	public WebElement getElementText() {
		return ElementText;
	}

	

	public WebElement getWebsiteName() {
		return WebsiteName;
	}

	

	public WebElement getEmployees() {
		return Employees;
	}

	

	public WebElement getPhoneNum() {
		return PhoneNum;
	}

	public WebElement getFaxNum() {
		return Fax;
	}

	public WebElement getFirstName() {
		return FirstName;
	}



	public WebElement getLastName() {
		return LastName;
	}



	public WebElement getCompany() {
		return Company;
	}



	public WebElement getTitle() {
		return Title;
	}



	public WebElement getMobileNum() {
		return MobileNum;
	}



	public WebElement getSecondaryMail() {
		return SecondaryMail;
	}


	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getOwnerName() {
		return OwnerName;
	}

	
	public WebElement getLeadSource() {
		return LeadSource;
	}



	public WebElement getIndustry() {
		return Industry;
	}



	public WebElement getLeadStatus() {
		return LeadStatus;
	}



	public WebElement getRating() {
		return Rating;
	}



	public WebElement getFax() {
		return Fax;
	}



	//Business Methods
	public void verifyPage(String Value) {
		
		
		boolean status = ElementText.getText().contains(Value);
		Assert.assertEquals(status, true, Value+" is not added to Database");
		System.out.println(Value+" is added to Database");

//		if ((ElementText.getText()).contains(Value)) {
//
//			System.out.println("Data is added to Database");
//		} else {
//			System.out.println("Data is not added to Database");
//		}
	}

	public void verifyFirstName(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(FirstName.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");

//		if (FirstName.getText().equalsIgnoreCase(value)) {
//			System.out.println(value+" is added");
//		} else {
//			System.out.println(value+" is not added");
//
//		}
	}




	public void verifyLastName(String Value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(LastName.getText(), Value,Value+" is not added");
		soft.assertAll();
		System.out.println(Value+" is added");
//		if (LastName.getText().equalsIgnoreCase(Value)) {
//			System.out.println(Value + " is added...");
//		} else {
//			System.out.println(Value + " is not added...");
//		}

	}

	public void verifyCompany(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Company.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");

//		if (Company.getText().equalsIgnoreCase(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}

	public void verifyMobileNum(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(MobileNum.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (MobileNum.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}

	}
	public void verifyPrimaryMail(String value) {
		
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(EmailId.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (EmailId.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifySecondaryMail(String value) {
		
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(SecondaryMail.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (SecondaryMail.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyFax(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Fax.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Fax.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyWebsite(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(WebsiteName.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (WebsiteName.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyNoOfEmp(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Employees.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Employees.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyTitle(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Title.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Title.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyLeadSource(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(LeadSource.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (LeadSource.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyLeadStatus(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(LeadStatus.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
		
//		if (LeadStatus.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyRating(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Rating.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Rating.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}
	public void verifyIndustry(String value) {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Industry.getText(), value,value+" is not added");
		soft.assertAll();
		System.out.println(value+" is added");
//		if (Industry.getText().equals(value)) {
//			System.out.println(value + " is added...");
//		} else {
//			System.out.println(value + " is not added...");
//		}
		
	}

}
