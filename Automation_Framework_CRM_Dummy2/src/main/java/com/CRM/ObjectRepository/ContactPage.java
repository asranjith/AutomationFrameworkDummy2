package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


		//Create POM Class
public class ContactPage {
		
	//Object Initialisation
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Object Creation
	
	@FindBy(name="search_text")
	private WebElement SearchContact;
	
	@FindBy(name="submit")
	private WebElement SearchBtn;
	
	@FindAll({@FindBy(id="bas_searchfield"),@FindBy(name="search_field")})
	private WebElement OrgDropDown;
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateContact;
	
	
	@FindBy(partialLinkText = "Advanced")
	private WebElement AdvanceSearch;
	
	

	
	//Genarate Getters
	
	

	public WebElement getSearchContact() {
		return SearchContact;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getCreateContact() {
		return CreateContact;
	}

	public WebElement getAdvanceSearch() {
		return AdvanceSearch;
	}
	
	
	

	
	
	
	//Business Methods
	
	public void createContact() {
		CreateContact.click();
	}
	
	public void searchOrg(String OrgName) {
		SearchContact.sendKeys(OrgName);
	}
	
	
	public void searchButton() {
		SearchBtn.click();
	}
	
	
	
	
	
	
	

}
