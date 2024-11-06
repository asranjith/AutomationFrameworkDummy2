package com.CRM.ContactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.ObjectRepository.ChildWindowOfContactPage;
import com.CRM.ObjectRepository.ContactInfoPage;
import com.CRM.ObjectRepository.ContactPage;
import com.CRM.ObjectRepository.CreateNewContact;
import com.CRM.ObjectRepository.CreateNewOrganisation;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.OrganisationInfoPage;
import com.CRM.ObjectRepository.OrganisationPage;

public class TestScriptForCont extends BaseClassForCRM {

	@Test(groups = "smoke",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createContact() throws EncryptedDocumentException, IOException {
		// Data from Excel file

		String Contact_No = Excel.getDataFromExcelFile("Contact", 1, 2) + j.generateRandomNumber(10000);

		String Name = Excel.getDataFromExcelFile("Contact", 1, 3) + j.generateRandomNumber(10000);

		// For Browser

		HomePage hp = new HomePage(driver);
		hp.navigateToContacts();
		ContactPage cp = new ContactPage(driver);
		cp.createContact();
		CreateNewContact cre = new CreateNewContact(driver);
		cre.addContact(Name, Contact_No);
		ContactInfoPage cip = new ContactInfoPage(driver);
		cip.verifyPage(Name);
		System.out.println();
		cip.verifyLastName(Name);
		System.out.println();
		cip.verifyMobileNum(Contact_No);
	}

	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createContactWithDate() throws EncryptedDocumentException, IOException {

		// Data from Excel file

		String Contact_Num = Excel.getDataFromExcelFile("Contact", 1, 2) + j.generateRandomNumber(10000);
		String Name = Excel.getDataFromExcelFile("Contact", 1, 3) + j.generateRandomNumber(10000);

		// For Current_Date
		String Current_Date = j.getCurrentDate();

		// For End_Date
		String Last_Date = j.getRequiredDate(30);
		
		HomePage hp = new HomePage(driver);
		hp.navigateToContacts();
		ContactPage cp = new ContactPage(driver);
		cp.createContact();
		CreateNewContact cre = new CreateNewContact(driver);
		cre.addContact(Name, Contact_Num, Current_Date, Last_Date);
		ContactInfoPage cip = new ContactInfoPage(driver);
		cip.verifyPage(Name);
		cip.verifyLastName(Name);
		cip.verifyMobileNum(Contact_Num);
		cip.verifyStartDate(Current_Date);
		cip.verifyEndDate(Last_Date);
	}
	
	
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void createContactWithOrgCredentials() throws EncryptedDocumentException, IOException {
		
		// For Organisation from Excel
	
		String Org_Name = Excel.getDataFromExcelFile("ORG", 1, 2)+ j.generateRandomNumber(10000);
		String PHNO = Excel.getDataFromExcelFile("ORG", 1, 3)+ j.generateRandomNumber(100);//3
		String Industry = Excel.getDataFromExcelFile("ORG",1, 5);//5
		String Type = Excel.getDataFromExcelFile("ORG", 1, 6);//6
		
		// For Contact from Excel
		
		String Mob_No = Excel.getDataFromExcelFile("Contact", 1, 2) + j.generateRandomNumber(10000);
		String Last_Name = Excel.getDataFromExcelFile("Contact", 1, 3) + j.generateRandomNumber(10000);
	
		// For Current_Date using Utility
		String Start_Date = j.getCurrentDate();

		// For End_Date using Utility
		String End_Date = j.getRequiredDate(30);
		
		// For Organization
		HomePage hp=new HomePage(driver);
		hp.navigateToOrganisation();
		OrganisationPage op=new OrganisationPage(driver);
		op.createOrg();
		CreateNewOrganisation cre=new CreateNewOrganisation(driver);
		
		wu.selectByVisibleText(cre.getIndustry(), Industry);
		wu.selectByvalue(cre.getType(), Type);
		cre.createOrg(Org_Name, PHNO);
		
		OrganisationInfoPage oip=new OrganisationInfoPage(driver);
		oip.verifyPage(Org_Name);
		oip.verifyContact(PHNO);
		oip.verifyIndustry(Industry);
		oip.verifyType(Type);
		oip.verifyOrgName(Org_Name);
//		For Contacts
		hp.navigateToContacts();
		ContactPage cp=new ContactPage(driver);
		cp.createContact();
		CreateNewContact cnc=new CreateNewContact(driver);
		cnc.lastName(Last_Name);
		cnc.mobilePhone(Mob_No);
		cnc.orgName();
		wu.switchToBrowserByTitle(driver,"Accounts&action");
		ChildWindowOfContactPage cwcp=new ChildWindowOfContactPage(driver);
		cwcp.searchOrg(driver,Org_Name);
		driver.findElement(By.xpath("//a[text()='"+Org_Name+"']")).click();
		wu.switchToBrowserByTitle(driver,"Contacts&action");
		cnc.startDate(Start_Date);
		cnc.endDate(End_Date);
		cnc.saveButton();
		
		ContactInfoPage cip=new ContactInfoPage(driver);
		cip.verifyPage(Last_Name);
		cip.verifyLastName(Last_Name);
		cip.verifyMobileNum(Mob_No);
		cip.verifyStartDate(Start_Date);
		cip.verifyEndDate(End_Date);

		
	}

}
