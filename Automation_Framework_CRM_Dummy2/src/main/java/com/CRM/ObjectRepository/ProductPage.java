package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Create POM Class
public class ProductPage {

	// Object Initialisation
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Object Creation

	@FindBy(name = "search_text")
	private WebElement SearchProduct;

	@FindBy(name = "submit")
	private WebElement SearchBtn;

	@FindAll({ @FindBy(id = "bas_searchfield"), @FindBy(name = "search_field") })
	private WebElement ProductDropDown;

	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement CreateProduct;

	@FindBy(partialLinkText = "Advanced")
	private WebElement AdvanceSearch;

	// Genarate Getters

	public WebElement getSearchContact() {
		return SearchProduct;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getCreateContact() {
		return CreateProduct;
	}

	public WebElement getAdvanceSearch() {
		return AdvanceSearch;
	}

	// Business Methods

	public void createProduct() {
		CreateProduct.click();
	}

	public void searchProduct(String OrgName) {
		SearchProduct.sendKeys(OrgName);
	}

	public void searchButton() {
		SearchBtn.click();
	}

}
