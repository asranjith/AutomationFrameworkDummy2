package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	//Rule 1: Class Creationn
public class OrganisationPage {
	
	// Rule 2: Object Initialisation
	public OrganisationPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	//Rule 3: Object Identification
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement CreateOrg;
	@FindBy(name="search_text")
	private WebElement SearchOrg;
	@FindBy(name="submit")
	private WebElement SearchBtn;
	@FindBy(partialLinkText = "Advanced")
	private WebElement AdvancedSearch;
	@FindAll({@FindBy (id="bas_searchfield"),@FindBy(name ="search_field")})
	private WebElement OrgDropdown;
	@FindBy(linkText = "del")
	private WebElement DeleteOrg;
	@FindAll({@FindBy(id="51"),@FindBy(name="selected_id")})
	private WebElement OrgCheckBox;
	
	
	//Rule 4- Provide Getters Method
	public WebElement getCreateOrg() {
		return CreateOrg;
	}
	public WebElement getSearchOrg() {
		return SearchOrg;
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	public WebElement getOrgDropdown() {
		return OrgDropdown;
	}
	public WebElement getDeleteOrg() {
		return DeleteOrg;
	}
	public WebElement getAdvancedSearch() {
		return AdvancedSearch;
	}
	public WebElement getOrgCheckBox() {
		return OrgCheckBox;
	}
	
	
	//Business Methods

	public void createOrg() {
//		getCreateOrg().click();
		CreateOrg.click();
	}
	public void searchOrg(String OrgName) {
//		getSearchOrg().sendKeys(OrgName);
		SearchOrg.sendKeys(OrgName);
	}
	public void searchButton() {
//		getSearchBtn().click();
		SearchBtn.click();
	}
	
	public void deleteOrg() {
		DeleteOrg.click();
		//driver.switchTo().alert().accept();
	}
	
	public void orgCheckBox() {
		OrgCheckBox.click();
	}
	
	
	
	
}
