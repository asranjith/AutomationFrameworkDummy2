package DataProviderConcepts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CRM.Generic.FileUtilityTest.ExcelUtility;

public class ToLearnDataProviderFromExcel {

	@Test(dataProvider = "getData")
	public void fetchData(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println();
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {

		
		ExcelUtility Excel=new ExcelUtility();
		int RowCount = Excel.getRowCount("Mobiles");
		Object[][] ObjArr = new Object[RowCount][2];
		for(int i=0;i<RowCount;i++) {
			ObjArr[i][0]=Excel.getDataFromExcelFile("Mobiles", i+1, 1);
			ObjArr[i][1]=Excel.getDataFromExcelFile("Mobiles", i+1, 2);
			
			
		}
		
		return ObjArr;
	}

}
