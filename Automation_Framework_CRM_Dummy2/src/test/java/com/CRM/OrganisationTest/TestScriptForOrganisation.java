package com.CRM.OrganisationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.ObjectRepository.CreateNewOrganisation;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.OrganisationInfoPage;
import com.CRM.ObjectRepository.OrganisationPage;

public class TestScriptForOrganisation extends BaseClassForCRM {

	@Test(groups = "smoke",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createOrg() throws IOException {

		// Data from Excel file
		String Org_Name = Excel.getDataFromExcelFile("ORG", 1, 2) + j.generateRandomNumber(10000);

		HomePage hp = new HomePage(driver);
		hp.navigateToOrganisation();

		OrganisationPage op = new OrganisationPage(driver);
		op.createOrg();
		CreateNewOrganisation cre = new CreateNewOrganisation(driver);
		cre.createOrg(Org_Name);
		OrganisationInfoPage oip = new OrganisationInfoPage(driver);
		oip.verifyPage(Org_Name);
		oip.verifyOrgName(Org_Name+"5");

	}
	
	
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createOrgWithContact() throws EncryptedDocumentException, IOException {
		//Data from Excel file
		
		String cell_Value = Excel.getDataFromExcelFile("ORG", 1, 2) + j.generateRandomNumber(10000);
		String PH_NO = Excel.getDataFromExcelFile("ORG", 1, 3) + j.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.navigateToOrganisation();
		
		OrganisationPage op=new OrganisationPage(driver);
		op.createOrg();
		
		CreateNewOrganisation cre=new CreateNewOrganisation(driver);
		cre.createOrg(cell_Value, PH_NO);
		
		OrganisationInfoPage oip=new OrganisationInfoPage(driver);
		oip.verifyPage(cell_Value);
		oip.verifyOrgName(cell_Value);
		oip.verifyContact(PH_NO);
			
	}
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createOrgWithCredentials() throws EncryptedDocumentException, IOException {
		
	
		String Org_Name	 = Excel.getDataFromExcelFile("ORG",1, 2) +j.generateRandomNumber(10000) ;
		String Mob_No	 = Excel.getDataFromExcelFile("ORG",1, 3) +j.generateRandomNumber(10000) ;
		String Industry = Excel.getDataFromExcelFile("ORG", 1, 5);
		String Type= Excel.getDataFromExcelFile("ORG", 1, 6);
		
		HomePage hp=new HomePage(driver);
		hp.navigateToOrganisation();
		
		
		OrganisationPage op=new OrganisationPage(driver);
		op.createOrg();
		
		CreateNewOrganisation cre=new CreateNewOrganisation(driver);
		cre.getOrgName().sendKeys(Org_Name);
		cre.getPhoneNo().sendKeys(Mob_No);
		WebElement Indust = cre.getIndustry();
		wu.selectByvalue(Indust, Industry);
		WebElement Typ = cre.getType();
		wu.selectByVisibleText(Typ, Type);
		cre.clickSaveButton();
		OrganisationInfoPage oip=new OrganisationInfoPage(driver);
		oip.verifyPage(Org_Name);
		oip.verifyOrgName(Org_Name);
		oip.verifyContact(Mob_No);
		oip.verifyIndustry(Industry);
		oip.verifyType(Type);
		
	}
	
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void deleteOrg() throws EncryptedDocumentException, IOException {

		
		String Org_Name = Excel.getDataFromExcelFile("ORG", 1, 2) + j.generateRandomNumber(10000);
		String PH_NO = Excel.getDataFromExcelFile("ORG", 1, 3) + j.generateRandomNumber(1000);
		
		/*
		 * NOTE : We should Initialize login page object once Driver and browser is
		 * Declared...............
		 * 
		 * 
		 */

		HomePage hp = new HomePage(driver);
		hp.navigateToOrganisation();

		OrganisationPage op = new OrganisationPage(driver);
		op.createOrg();
		CreateNewOrganisation cre = new CreateNewOrganisation(driver);
		cre.createOrg(Org_Name,PH_NO);
		OrganisationInfoPage oip = new OrganisationInfoPage(driver);
		oip.verifyPage(Org_Name);
		oip.verifyOrgName(Org_Name);
		oip.verifyContact(PH_NO);
		hp.navigateToOrganisation();
		wu.selectByVisibleText(op.getOrgDropdown(),"Organization Name");
		op.searchOrg(Org_Name);
		op.searchButton();
		op.orgCheckBox();
		op.deleteOrg();
		wu.acceptPopup(driver);
		Reporter.log("Organisation deleted Successfully.......");
	}
}
