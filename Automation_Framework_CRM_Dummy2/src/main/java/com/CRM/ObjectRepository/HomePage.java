package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Calendar")
	private WebElement CalendarLink;

	@FindBy(linkText = "Leads")
	private WebElement LeadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement OrgLink;

	@FindBy(linkText = "Contacts")
	private WebElement ContactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement OpportunitiesLink;

	@FindBy(linkText = "Products")
	private WebElement ProductsLink;

	@FindBy(linkText = "Documents")
	private WebElement DocumentsLink;

	@FindBy(linkText = "Email")
	private WebElement EmailLink;

	@FindBy(partialLinkText = "Tickets")
	private WebElement TicketsLink;

	@FindBy(partialLinkText = "Dashboard")
	private WebElement DashboardLink;

	@FindBy(partialLinkText = "Home")
	private WebElement HomePageLink;

	@FindBy(linkText = "More")
	private WebElement MoreLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrator;
	
	public WebElement getAdministrator() {
		return Administrator;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	@FindBy(linkText = "Sign Out")
	private WebElement LogoutLink;

	@FindAll({ @FindBy(linkText = "Services"), @FindBy(name = "Services"), @FindBy(id = "more") })
	private WebElement Services;

	@FindAll({ @FindBy(linkText = "Assets"), @FindBy(name = "Assets"), @FindBy(id = "more") })
	private WebElement Assets;

	@FindAll({ @FindBy(linkText = "Vendors"), @FindBy(name = "Vendors"), @FindBy(id = "more") })
	private WebElement Vendors;

	@FindAll({ @FindBy(partialLinkText = "Price"), @FindBy(name = "Price Books"), @FindBy(id = "more") })
	private WebElement BookPrice;

	@FindAll({ @FindBy(partialLinkText = "Purchase"), @FindBy(name = "Purchase Order"), @FindBy(id = "more") })
	private WebElement PurchaseOrder;

	@FindAll({ @FindBy(linkText = "Campaigns"), @FindBy(name = "Campaigns"), @FindBy(id = "more") })
	private WebElement Campaigns;

	@FindAll({ @FindBy(linkText = "Reports"), @FindBy(name = "Reports"), @FindBy(id = "more") })
	private WebElement Reports;

	@FindAll({ @FindBy(linkText = "Projects"), @FindBy(name = "Projects"), @FindBy(id = "more") })
	private WebElement Projects;

	@FindBy(id = "qccombo")
	private WebElement QuickDropdown;

	public WebElement getQuickDropdown() {
		return QuickDropdown;
	}

	public WebElement getCalendarLink() {
		return CalendarLink;
	}

	public WebElement getLeadsLink() {
		return LeadsLink;
	}

	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getDocumentsLink() {
		return DocumentsLink;
	}

	public WebElement getEmailLink() {
		return EmailLink;
	}

	public WebElement getTicketsLink() {
		return TicketsLink;
	}

	public WebElement getDashboardLink() {
		return DashboardLink;
	}

	public WebElement getHomePageLink() {
		return HomePageLink;
	}

	public WebElement getOrgLink() {
		return OrgLink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public WebElement getServices() {
		return Services;
	}

	public WebElement getAssets() {
		return Assets;
	}

	public WebElement getVendors() {
		return Vendors;
	}

	public WebElement getBookPrice() {
		return BookPrice;
	}

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	public WebElement getCampaigns() {
		return Campaigns;
	}

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getProjects() {
		return Projects;
	}

	// Business Methods

	public void navigateToOrganisation() {
		// getOrgLink().click();
		OrgLink.click();
	}

	public void navigateToCalendar() {
		// getCalendarLink().click();
		CalendarLink.click();
	}

	public void navigateToContacts() {
		// getContactsLink().click();
		ContactsLink.click();
	}

	public void navigateToLeads() {
		// getLeadsLink().click();
		LeadsLink.click();
	}

	public void navigateToOpportunity() {
		// getOpportunitiesLink().click();
		OpportunitiesLink.click();
	}

	public void navigateToDocuments() {
		// getDocumentsLink().click();
		DocumentsLink.click();
	}

	public void navigateToProducts() {
		// getProductsLink().click();
		ProductsLink.click();
	}

	public void navigateToEmail() {
		// getEmailLink().click();
		EmailLink.click();
	}

	public void navigaeToDashboard() {
		// getDashboardLink().click();
		DashboardLink.click();
	}

	public void navigateToTroubleTickets() {
		// getTicketsLink().click();
		TicketsLink.click();
	}

	public void navigateToHomePage() {
		// getHomePageLink().click();
		HomePageLink.click();
	}

	public void navigateToAssets(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Assets).click().perform();
	}

	public void navigateToServices(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Services).click().perform();
	}

	public void navigateToPurchaseOrder(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(PurchaseOrder).click().perform();
	}

	public void navigateToPriceBooks(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(BookPrice).click().perform();
	}

	public void navigateToVendors(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Vendors).click().perform();
	}

	public void navigateToProjects(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Projects).click().perform();
	}

	public void navigateToCampaigns(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Campaigns).click().perform();
	}

	public void navigateToReports(WebDriver driver) {

		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		act.moveToElement(Reports).click().perform();
	}
	public void logout(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Administrator).perform();
		act.moveToElement(LogoutLink).click().perform();
		
	}
}
