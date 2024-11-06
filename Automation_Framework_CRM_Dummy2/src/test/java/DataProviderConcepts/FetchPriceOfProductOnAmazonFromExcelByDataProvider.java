package DataProviderConcepts;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.CRM.Generic.FileUtilityTest.DataProviderClass;
import com.CRM.Generic.FileUtilityTest.ExcelUtility;

public class FetchPriceOfProductOnAmazonFromExcelByDataProvider {
	
	@Test(dataProviderClass = DataProviderClass.class,dataProvider = "getData")
	public void getprice(String Brand,String Product) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Brand,Keys.ENTER);
		String Price=null;
		for(;;) {
			try {
				Price = driver.findElement(By.xpath("//span[text()='"+Product+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='₹']/following-sibling::span")).getText();
	//			String text  = driver.findElement(By.xpath("//span[text()='"+Product+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/span[2]/span[2]")).getText();
				break;
			} catch (Exception e) {
				driver.findElement(By.linkText("Next")).click();
			}
		
		}
		
		System.out.println(Price);
		driver.quit();		
		
		
	}
//	@DataProvider
//	public Object[][] getData() throws EncryptedDocumentException, IOException {
//
//		Object[][] ObjArr = new Object[3][2];
//		ExcelUtility Excel=new ExcelUtility();
//		int RowCount = Excel.getRowCount("Mobiles");
//		for(int i=0;i<RowCount;i++) {
//			ObjArr[i][0]=Excel.getDataFromExcelFile("Mobiles", i+1, 1);
//			ObjArr[i][1]=Excel.getDataFromExcelFile("Mobiles", i+1, 2);
//			
//			
//		}
//		
//		return ObjArr;
//	}
}
