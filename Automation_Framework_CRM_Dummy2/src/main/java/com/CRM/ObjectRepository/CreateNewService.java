package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class
public class CreateNewService {

	// Object Initialization
	public CreateNewService(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Object Creation
	@FindBy(name = "servicename")
	private WebElement ServiceName;

	@FindBy(name = "service_usageunit")
	private WebElement UnitDropdown;

	@FindBy(name = "website")
	private WebElement Website;
	
	@FindBy(name = "servicecategory")
	private WebElement Category;

	@FindAll({ @FindBy(id = "qty_per_unit"), @FindBy(name = "qty_per_unit") })
	private WebElement UnitQty;

	@FindAll({ @FindBy(id = "jscal_field_sales_start_date"), @FindBy(name = "sales_start_date") })
	private WebElement SalesStartDate;

	@FindAll({ @FindBy(id = "jscal_field_sales_end_date"), @FindBy(name = "sales_end_date") })
	private WebElement SalesEndDate;

	@FindAll({ @FindBy(id = "jscal_field_start_date"), @FindBy(name = "start_date") })
	private WebElement SupportStartDate;

	@FindAll({ @FindBy(id = "jscal_field_expiry_date"), @FindBy(name = "expiry_date") })
	private WebElement SupportExpiryDate;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebtn;

	// Getters

	
	
	public WebElement getServiceName() {
		return ServiceName;
	}

	public WebElement getUnitDropdown() {
		return UnitDropdown;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getUnitQty() {
		return UnitQty;
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

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	
	// Business Methods
	
	public void serviceName(String name) {
		ServiceName.sendKeys(name);
	}
	
	

	public void unitQty(String value) {
		UnitQty.sendKeys(value);
	}
	public void website(String value) {
		Website.sendKeys(value);
	}

	public void salesStartDate(String Date) {
		SalesStartDate.clear();
		SalesStartDate.sendKeys(Date);
	}
	public void salesEndDate(String Date) {
		SalesEndDate.clear();
		SalesEndDate.sendKeys(Date);
	}
	
	public void supportStartDate(String Date) {
		SupportStartDate.clear();
		SupportStartDate.sendKeys(Date);
	}

	public void supportExpiryDate(String Date) {
		SupportExpiryDate.clear();
		SupportExpiryDate.sendKeys(Date);
	}

	public void saveButton() {
		Savebtn.click();
	}
	
	public void addService(String Name,String website) {
		ServiceName.sendKeys(Name);
		Website.sendKeys(website);
		Savebtn.click();
	}
	public void addServices(String name,String value,String SDate,String EDate,String sdate,String edate) {
		ServiceName.sendKeys(name);
		Website.sendKeys(value);
		SalesStartDate.clear();
		SalesStartDate.sendKeys(SDate);
		SalesEndDate.clear();
		SalesEndDate.sendKeys(EDate);
		SupportStartDate.clear();
		SupportStartDate.sendKeys(sdate);
		SupportExpiryDate.clear();
		SupportExpiryDate.sendKeys(edate);
		Savebtn.click();
	}

	public void addServices(String name,String value,String num,String SDate,String EDate,String sdate,String edate) {
		ServiceName.sendKeys(name);
		Website.sendKeys(value);
		UnitQty.sendKeys(num);
		SalesStartDate.clear();
		SalesStartDate.sendKeys(SDate);
		SalesEndDate.clear();
		SalesEndDate.sendKeys(EDate);
		SupportStartDate.clear();
		SupportStartDate.sendKeys(sdate);
		SupportExpiryDate.clear();
		SupportExpiryDate.sendKeys(edate);
		Savebtn.click();
	}

}
