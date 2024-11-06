package com.CRM.LeadsTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.ObjectRepository.CreateNewLeads;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.LeadsInfoPage;
import com.CRM.ObjectRepository.LeadsPage;


public class TestScriptForLeads extends BaseClassForCRM {

	@Test(groups = "smoke",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createLeads() throws EncryptedDocumentException, IOException {

		// Data from Excel file

		String Prefix = Excel.getDataFromExcelFile("Leads", 3, 2);
		String First_Name = Excel.getDataFromExcelFile("Leads", 3, 3);
		String Last_Name = Excel.getDataFromExcelFile("Leads", 3, 4) + j.generateRandomNumber(100);
		String Company = Excel.getDataFromExcelFile("Leads", 3, 5) + j.generateRandomNumber(100);
		// For Browser
		HomePage hp = new HomePage(driver);
		hp.navigateToLeads();
		LeadsPage lead = new LeadsPage(driver);
		lead.createLeads();
		CreateNewLeads cre = new CreateNewLeads(driver);
		wu.selectByVisibleText(cre.getPrefix(), Prefix);
		cre.firstName(First_Name);
		cre.lastName(Last_Name);
		cre.company(Company);
		cre.saveButton();
		// Compare & Verify the Products
		LeadsInfoPage lip = new LeadsInfoPage(driver);
		lip.verifyPage(Last_Name);
		lip.verifyFirstName(First_Name);
		lip.verifyLastName(Last_Name);
		lip.verifyCompany(Company);
	}

	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createLeadsWithContact() throws EncryptedDocumentException, IOException {

		// Data from Excel file

		String Prefix = Excel.getDataFromExcelFile("Leads", 3, 2);
		String Last_Name = Excel.getDataFromExcelFile("Leads", 3, 4) + j.generateRandomNumber(100);
		String Company = Excel.getDataFromExcelFile("Leads", 3, 5) + j.generateRandomNumber(100);
		String Mob_No = Excel.getDataFromExcelFile("Leads", 3, 10) + j.generateRandomNumber(10000);

		HomePage hp = new HomePage(driver);
		hp.navigateToLeads();
		LeadsPage lead = new LeadsPage(driver);
		lead.createLeads();
		CreateNewLeads cre = new CreateNewLeads(driver);
		wu.selectByVisibleText(cre.getPrefix(), Prefix);
		cre.lastName(Last_Name);
		cre.company(Company);
		cre.mobileNum(Mob_No);
		cre.saveButton();

		// Compare & Verify the Products
		LeadsInfoPage lip = new LeadsInfoPage(driver);
		lip.verifyPage(Last_Name);
		lip.verifyLastName(Last_Name);
		lip.verifyCompany(Company);
		lip.verifyMobileNum(Mob_No);

	}

	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createLeadsWithCredenials() throws EncryptedDocumentException, IOException {

		// Data from Excel file

		String Prefix = Excel.getDataFromExcelFile("Leads", 3, 2);
		String First_Name = Excel.getDataFromExcelFile("Leads", 3, 3);
		String Last_Name = Excel.getDataFromExcelFile("Leads", 3, 4) + j.generateRandomNumber(100);
		String Company = Excel.getDataFromExcelFile("Leads", 3, 5) + j.generateRandomNumber(100);
		String Lead_Source = Excel.getDataFromExcelFile("Leads", 3, 6);
		String Industry = Excel.getDataFromExcelFile("Leads", 3, 7);
		String Lead_Status = Excel.getDataFromExcelFile("Leads", 3, 8);
		String Rating = Excel.getDataFromExcelFile("Leads", 3, 9);
		String Mob_No = Excel.getDataFromExcelFile("Leads", 3, 10) + j.generateRandomNumber(10000);

		// For Browser

		HomePage hp = new HomePage(driver);
		hp.navigateToLeads();
		LeadsPage lead = new LeadsPage(driver);
		lead.createLeads();
		CreateNewLeads cre = new CreateNewLeads(driver);
		wu.selectByVisibleText(cre.getPrefix(), Prefix);
		cre.firstName(First_Name);
		cre.lastName(Last_Name);
		cre.company(Company);
		cre.mobileNum(Mob_No);
		wu.selectByVisibleText(cre.getLeadSource(), Lead_Source);
		wu.selectByVisibleText(cre.getIndustry(), Industry);
		wu.selectByVisibleText(cre.getLeadStatus(), Lead_Status);
		wu.selectByVisibleText(cre.getRating(), Rating);
		cre.saveButton();

		// Compare & Verify the Products
		LeadsInfoPage lip = new LeadsInfoPage(driver);
		lip.verifyPage(Last_Name);
		lip.verifyFirstName(First_Name);
		lip.verifyLastName(Last_Name);
		lip.verifyCompany(Company);
		lip.verifyMobileNum(Mob_No);
		lip.verifyLeadSource(Lead_Source);
		lip.verifyIndustry(Industry);
		lip.verifyLeadStatus(Lead_Status);
		lip.verifyRating(Rating);

	}

}
