package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeads {

	public CreateNewLeads(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "salutationtype")
	private WebElement Prefix;

	@FindBy(name="leadsource")
	private WebElement LeadSource;
	
	@FindBy(name="industry")
	private WebElement Industry;
	
	@FindBy(name="leadstatus")
	private WebElement LeadStatus;
	
	@FindBy(name="rating")
	private WebElement Rating;

	@FindBy(name = "firstname")
	private WebElement FirstName;

	@FindBy(name = "lastname")
	private WebElement LastName;

	@FindBy(name = "company")
	private WebElement Company;

	@FindBy(name = "website")
	private WebElement Website;

	@FindAll({ @FindBy(id = "designation"), @FindBy(name = "designation") })
	private WebElement Title;

	@FindAll({ @FindBy(id = "phone"), @FindBy(name = "phone") })
	private WebElement PhoneNum;

	@FindAll({ @FindBy(id = "mobile"), @FindBy(name = "mobile") })
	private WebElement MobileNum;

	@FindAll({ @FindBy(id = "fax"), @FindBy(name = "fax") })
	private WebElement Fax;

	@FindAll({ @FindBy(id = "email"), @FindBy(name = "email") })
	private WebElement Email;

	@FindAll({ @FindBy(id = "noofemployees"), @FindBy(name = "noofemployees") })
	private WebElement No_Of_Employees;

	@FindAll({ @FindBy(id = "secondaryemail"), @FindBy(name = "secondaryemail") })
	private WebElement SecondaryEmail;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebtn;
	

	//Getters
	
	public WebElement getPrefix() {
		return Prefix;
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

	public WebElement getPhoneNum() {
		return PhoneNum;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getMobileNum() {
		return MobileNum;
	}

	public WebElement getFax() {
		return Fax;
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

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNo_Of_Employees() {
		return No_Of_Employees;
	}

	public WebElement getSecondaryEmail() {
		return SecondaryEmail;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	// Business Methods

	public void firstName(String value) {
		FirstName.sendKeys(value);
	}

	public void lastName(String value) {
		LastName.sendKeys(value);
	}

	public void company(String value) {
		Company.sendKeys(value);
	}

	public void title(String value) {
		Title.sendKeys(value);
	}

	public void mobileNum(String value) {
		MobileNum.sendKeys(value);
	}

	public void phoneNum(String value) {
		PhoneNum.sendKeys(value);
	}

	public void fax(String value) {
		Fax.sendKeys(value);
	}

	public void primaryMail(String value) {
		Email.sendKeys(value);
	}

	public void secondaryMail(String value) {
		SecondaryEmail.sendKeys(value);
	}

	public void noOfEmp(String value) {
		No_Of_Employees.sendKeys(value);
	}

	public void website(String value) {
		Website.sendKeys(value);
	}

	public void saveButton() {
		Savebtn.click();
	}

}
