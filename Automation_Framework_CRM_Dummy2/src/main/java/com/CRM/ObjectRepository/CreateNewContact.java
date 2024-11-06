package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class
public class CreateNewContact {

	// Object Initialization
	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Object Creation
	@FindBy(name = "lastname")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement OrgName;

	@FindAll({ @FindBy(id = "title"), @FindBy(name = "title") })
	private WebElement Title;

	@FindAll({ @FindBy(id = "department"), @FindBy(name = "department") })
	private WebElement Department;

	@FindAll({ @FindBy(id = "email"), @FindBy(name = "email") })
	private WebElement Email;

	@FindAll({ @FindBy(id = "secondaryemail"), @FindBy(name = "secondaryemail") })
	private WebElement SecondaryEmail;

	@FindAll({ @FindBy(id = "assistant"), @FindBy(name = "assistant") })
	private WebElement Assistant;

	@FindAll({ @FindBy(id = "assistantphone"), @FindBy(name = "assistantphone") })
	private WebElement AssistantPhone;

	@FindAll({ @FindBy(id = "phone"), @FindBy(name = "phone") })
	private WebElement OfficePhone;

	@FindAll({ @FindBy(id = "mobile"), @FindBy(name = "mobile") })
	private WebElement MobilePhone;

	@FindAll({ @FindBy(id = "homephone"), @FindBy(name = "homephone") })
	private WebElement HomePhone;

	@FindAll({ @FindBy(id = "otherphone"), @FindBy(name = "otherphone") })
	private WebElement OtherPhone;

	@FindAll({ @FindBy(id = "fax"), @FindBy(name = "fax") })
	private WebElement Fax;

	@FindAll({ @FindBy(id = "jscal_field_support_start_date"), @FindBy(name = "support_start_date") })
	private WebElement StartDate;

	@FindAll({ @FindBy(id = "jscal_field_support_end_date"), @FindBy(name = "support_end_date") })
	private WebElement EndDate;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebtn;

	// Getters
	public WebElement getLastname() {
		return Lastname;
	}
	
	public WebElement getOrgName() {
		return OrgName;
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

	public WebElement getSecondaryEmail() {
		return SecondaryEmail;
	}

	public WebElement getAssistant() {
		return Assistant;
	}

	public WebElement getAssistantPhone() {
		return AssistantPhone;
	}

	public WebElement getOfficePhone() {
		return OfficePhone;
	}

	public WebElement getMobilePhone() {
		return MobilePhone;
	}

	public WebElement getHomePhone() {
		return HomePhone;
	}

	public WebElement getOtherPhone() {
		return OtherPhone;
	}

	public WebElement getFax() {
		return Fax;
	}

	public WebElement getStartDate() {
		return StartDate;
	}

	public WebElement getEndDate() {
		return EndDate;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	// Business Methods
	
	public void lastName(String name) {
		Lastname.sendKeys(name);
	}
	
	public void orgName() {
		OrgName.click();
	}

	public void title(String title) {
		Title.sendKeys(title);
	}

	public void department(String value) {
		Department.sendKeys(value);
	}

	public void email(String value) {
		Email.sendKeys(value);
	}

	public void secondaryEmail(String value) {
		SecondaryEmail.sendKeys(value);
	}

	public void assistant(String value) {
		Assistant.sendKeys(value);
	}

	public void assistantPhone(String value) {
		AssistantPhone.sendKeys(value);
	}

	public void officePhone(String value) {
		OfficePhone.sendKeys(value);
	}

	public void mobilePhone(String value) {
		MobilePhone.sendKeys(value);
	}

	public void homePhone(String value) {
		HomePhone.sendKeys(value);
	}

	public void otherPhone(String value) {
		OtherPhone.sendKeys(value);
	}

	public void fax(String value) {
		Fax.sendKeys(value);
	}

	public void startDate(String Date) {
		StartDate.clear();
		StartDate.sendKeys(Date);
	}

	public void endDate(String Date) {
		EndDate.clear();
		EndDate.sendKeys(Date);
	}

	public void saveButton() {
		Savebtn.click();
	}
	
	public void addContact(String name,String Number) {
		Lastname.sendKeys(name);
		MobilePhone.sendKeys(Number);
		Savebtn.click();
	}
	public void addContact(String name,String Number,String StartDate,String EndDate) {
		Lastname.sendKeys(name);
		MobilePhone.sendKeys(Number);
		startDate(StartDate);
		endDate(EndDate);
		Savebtn.click();
	}
	

}
