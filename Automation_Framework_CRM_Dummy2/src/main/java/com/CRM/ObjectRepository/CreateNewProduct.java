package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class
public class CreateNewProduct {

	// Object Initialization
	public CreateNewProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Object Creation
	@FindBy(name = "productname")
	private WebElement PartName;

	@FindBy(name = "productcategory")
	private WebElement Category;

	@FindBy(name = "manufacturer")
	private WebElement Manufacturer;

	@FindBy(name = "website")
	private WebElement Website;

	@FindAll({ @FindBy(id = "productcode"), @FindBy(name = "productcode") })
	private WebElement PartNumber;

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

	public WebElement getPartName() {
		return PartName;
	}
	public WebElement getCategory() {
		return Category;
	}
	public WebElement getManufacturer() {
		return Manufacturer;
	}
	public WebElement getWebsite() {
		return Website;
	}
	public WebElement getPartNumber() {
		return PartNumber;
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
	
	public void addProduct(String name,String value) {
		PartName.sendKeys(name);
		PartNumber.sendKeys(value);
		Savebtn.click();
	}
	
	public void addProduct(String name,String value,String SDate,String EDate,String sdate,String edate) {
		PartName.sendKeys(name);
		PartNumber.sendKeys(value);
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

}
