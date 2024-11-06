package com.CRM.ServicesTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.ObjectRepository.CreateNewService;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.ServicePage;
import com.CRM.ObjectRepository.ServicesInfoPage;

public class TestScriptForServices extends BaseClassForCRM {

	@Test(groups = "smoke",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addServiceName() throws EncryptedDocumentException, IOException {
		
		String service_Name = Excel.getDataFromExcelFile("Services", 1,0)+j.generateRandomNumber(100);
		String Website=Excel.getDataFromExcelFile("Services", 1, 3);
		
	
		HomePage hp=new HomePage(driver);
		hp.navigateToServices(driver);
		ServicePage sp=new ServicePage(driver);
		sp.createService();
		CreateNewService cre=new CreateNewService(driver);
		cre.addService(service_Name, Website);
		Reporter.log("Data is saved.....");
		ServicesInfoPage sip=new ServicesInfoPage(driver);
		sip.verifyPage(service_Name);
		sip.verifyServiceName(service_Name);
		sip.verifyWebsite(Website);
		

	}
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addServiceswithDate() throws EncryptedDocumentException, IOException {
	
		
		String service_Name = Excel.getDataFromExcelFile("Services", 1,0)+j.generateRandomNumber(100);
		String Website=Excel.getDataFromExcelFile("Services", 1, 3);
		
		String SalesStartDate = j.getCurrentDate();
		String SalesEndDate = j.getRequiredDate(60);
		String SupportStartDate = j.getRequiredDate(-10);
		String SupportExpiryDate = j.getRequiredDate(180);
	
		HomePage hp=new HomePage(driver);
		hp.navigateToServices(driver);
		ServicePage sp=new ServicePage(driver);
		sp.createService();
		CreateNewService cre=new CreateNewService(driver);
		cre.addServices(service_Name, Website, SalesStartDate, SalesEndDate, SupportStartDate, SupportExpiryDate);
		Reporter.log("Data is saved.....");
		ServicesInfoPage sip=new ServicesInfoPage(driver);
		sip.verifyPage(service_Name);
		sip.verifyServiceName(service_Name);
		sip.verifyWebsite(Website);
		sip.verifySalesStartDate(SalesStartDate);
		sip.verifySalesEndDate(SalesEndDate);
		sip.verifySupportStartDate(SupportStartDate);
		sip.verifySupportExpiryDate(SupportExpiryDate);
		
	}
	
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addServicesWithCredentials() throws EncryptedDocumentException, IOException {
		String service_Name = Excel.getDataFromExcelFile("Services", 1,0)+j.generateRandomNumber(100);
		String Unit_Qty=Excel.getDataFromExcelFile("Services", 1, 1);
		String Category=Excel.getDataFromExcelFile("Services", 1, 2);
		String Website=Excel.getDataFromExcelFile("Services", 1, 3);
		
				
		String SalesStartDate = j.getCurrentDate();
		String SalesEndDate = j.getRequiredDate(60);
		String SupportStartDate = j.getRequiredDate(-10);
		String SupportExpiryDate = j.getRequiredDate(180);
		
		HomePage hp=new HomePage(driver);
		hp.navigateToServices(driver);
		ServicePage sp=new ServicePage(driver);
		sp.createService();
		CreateNewService cre=new CreateNewService(driver);
		
		wu.selectByVisibleText(cre.getCategory(),Category );
		cre.addServices(service_Name, Website, Unit_Qty, SalesStartDate, SalesEndDate, SupportStartDate, SupportExpiryDate);
		Reporter.log("Data is saved.....",true);
		ServicesInfoPage sip=new ServicesInfoPage(driver);
		sip.verifyPage(service_Name);
		sip.verifyServiceName(service_Name);
		sip.verifyWebsite(Website);
		sip.verifySalesStartDate(SalesStartDate);
		sip.verifySalesEndDate(SalesEndDate);
		sip.verifySupportStartDate(SupportStartDate);
		sip.verifySupportExpiryDate(SupportExpiryDate);
	}
	

}
