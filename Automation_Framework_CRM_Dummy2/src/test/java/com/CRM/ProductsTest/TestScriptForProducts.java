package com.CRM.ProductsTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.ObjectRepository.CreateNewProduct;
import com.CRM.ObjectRepository.HomePage;
import com.CRM.ObjectRepository.ProductInfoPage;
import com.CRM.ObjectRepository.ProductPage;

public class TestScriptForProducts extends BaseClassForCRM{
	
	@Test(groups = "smoke",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addProductName() throws EncryptedDocumentException, IOException {
	
		// Data from Excel file
		
		String Product_Name = Excel.getDataFromExcelFile("Products", 3, 2);
		String Part_Number = Excel.getDataFromExcelFile("Products", 3, 3)+ j.generateRandomNumber(100)+"CA";
		
		//Java utilities

		HomePage hp=new HomePage(driver);
		hp.navigateToProducts();
		ProductPage pp= new ProductPage(driver);
		pp.createProduct();
		CreateNewProduct cre=new CreateNewProduct(driver);
		cre.addProduct(Product_Name,Part_Number);
		
		// Compare & Verify the Products
		
		ProductInfoPage pip=new ProductInfoPage(driver);
		pip.verifyPage(Product_Name);
		pip.verifyPartName(Product_Name);
		pip.verifyPartNumber(Part_Number);
		
	}
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addProductWithDate() throws EncryptedDocumentException, IOException {
		
		// Data from Excel file

		String Product_Name = Excel.getDataFromExcelFile("Products", 3, 2);
		String Part_Number = Excel.getDataFromExcelFile("Products", 3, 3) + j.generateRandomNumber(100) + "CA";
		// Java utilities
		String SalesStartDate = j.getCurrentDate();
		String SalesEndDate = j.getRequiredDate(60);
		String SupportStartDate = j.getRequiredDate(-10);
		String SupportExpiryDate = j.getRequiredDate(180);

		// For Browser
		
		HomePage hp = new HomePage(driver);
		hp.navigateToProducts();
		ProductPage pp = new ProductPage(driver);
		pp.createProduct();
		CreateNewProduct cre = new CreateNewProduct(driver);
		cre.addProduct(Product_Name,Part_Number,SalesStartDate,SalesEndDate,SupportStartDate,SupportExpiryDate);

		// Compare & Verify the Products

		ProductInfoPage pip = new ProductInfoPage(driver);
		pip.verifyPage(Product_Name);
		pip.verifyPartName(Product_Name);
		pip.verifyPartNumber(Part_Number);
		pip.verifySalesStartDate(SalesStartDate);
		pip.verifySalesEndDate(SalesEndDate);
		pip.verifySupportStartDate(SupportStartDate);
		pip.verifySupportExpiryDate(SupportExpiryDate);
	}
	
	@Test(groups = "regression",retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void addProductWithCredentials() throws EncryptedDocumentException, IOException {
		
		// Data from Excel file
		
		String Product_Name = Excel.getDataFromExcelFile("Products", 3, 2);
		String Part_Number = Excel.getDataFromExcelFile("Products", 3, 3)+ j.generateRandomNumber(100)+"CA";
		String Manufacturer = Excel.getDataFromExcelFile("Products",3, 4);
		String Category = Excel.getDataFromExcelFile("Products", 3, 5);
		
		//Java utilities
		String SalesStartDate = j.getCurrentDate();
		String SalesEndDate = j.getRequiredDate(60);
		String SupportStartDate = j.getRequiredDate(-10);
		String SupportExpiryDate = j.getRequiredDate(180);
		
		
		HomePage hp=new HomePage(driver);
		hp.navigateToProducts();
		ProductPage pp= new ProductPage(driver);
		pp.createProduct();
		CreateNewProduct cre=new CreateNewProduct(driver);
		
		wu.selectByVisibleText(cre.getCategory(), Category);
		wu.selectByVisibleText(cre.getManufacturer(), Manufacturer);
		cre.addProduct(Product_Name, Part_Number, SalesStartDate, SalesEndDate, SupportStartDate, SupportExpiryDate);
		
		
		

		// Compare & Verify the Products
		
		ProductInfoPage pip=new ProductInfoPage(driver);
		pip.verifyPage(Product_Name);
		pip.verifyPartName(Product_Name);
		pip.verifyPartNumber(Part_Number);
		pip.verifyManufacturer(Manufacturer);
		pip.verifyCategory(Category);
		pip.verifySalesStartDate(SalesStartDate);
		pip.verifySalesEndDate(SalesEndDate);
		pip.verifySupportStartDate(SupportStartDate);
		pip.verifySupportExpiryDate(SupportExpiryDate);
	}

}
