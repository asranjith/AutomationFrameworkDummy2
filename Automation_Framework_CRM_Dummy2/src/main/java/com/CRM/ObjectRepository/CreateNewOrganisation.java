package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisation {

	public CreateNewOrganisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement OrgName;

//	@FindBy(name = "phone")
//	private WebElement Mobno;

	@FindBy(name = "industry")
	private WebElement Industry;

	@FindBy(name = "accounttype")
	private WebElement Type;

	@FindAll({ @FindBy(id = "phone"), @FindBy(name = "phone") })
	private WebElement PhoneNo;

	@FindAll({ @FindBy(id = "fax"), @FindBy(name = "fax") })
	private WebElement Fax;

	@FindAll({ @FindBy(id = "otherphone"), @FindBy(name = "otherphone") })
	private WebElement OtherPhone;

	@FindAll({ @FindBy(id = "email1"), @FindBy(name = "email1") })
	private WebElement Email;

	@FindAll({ @FindBy(id = "ownership"), @FindBy(name = "ownership") })
	private WebElement Ownership;

	@FindBy(name = "annual_revenue")
	private WebElement AnnualRevenue;
		
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])")
	private WebElement Savebtn;
	
	
	
	

	public WebElement getIndustry() {
		return Industry;
	}

	public WebElement getType() {
		return Type;
	}

	
	public WebElement getOrgName() {
		return OrgName;
	}

//	public WebElement getMobno() {
//		return Mobno;
//	}
	
	

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getPhoneNo() {
		return PhoneNo;
	}

	public WebElement getFax() {
		return Fax;
	}

	public WebElement getOtherPhone() {
		return OtherPhone;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOwnership() {
		return Ownership;
	}

	public WebElement getAnnualRevenue() {
		return AnnualRevenue;
	}

	// Business Methods

	public void createOrg(String name) {
		OrgName.sendKeys(name);
		Savebtn.click();
	}

	public void createOrg(String name, String number) {
		OrgName.sendKeys(name);
		PhoneNo.sendKeys(number);
		Savebtn.click();
		}
	
	
	public void otherPhone(String value) {
		OtherPhone.sendKeys(value);
	}

	public void fax(String value) {
		Fax.sendKeys(value);
	}

	public void officePhone(String value) {
		PhoneNo.sendKeys(value);
	}
	
	public void email(String value) {
		Email.sendKeys(value);
	}
	
	public void annualRevenue(String value) {
		AnnualRevenue.sendKeys(value);
	}
	
	public void ownership(String value) {
		Ownership.sendKeys(value);
	}
	
	public void clickSaveButton() {
		Savebtn.click();
	}
	
	
	
}
