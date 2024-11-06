package DataProviderConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@Test(dataProvider = "getData")
	public void fetchData(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println();
	}
	
	@DataProvider
	public Object[][] getData() {

		Object[][] ObjArr = new Object[3][2];
		ObjArr[0][0] = "Vignesh";
		ObjArr[0][1] = "123456";
		ObjArr[1][0] = "Varun";
		ObjArr[1][1] = "654321";
		ObjArr[2][0] = "Vasu";
		ObjArr[2][1] = "000000";
		return ObjArr;
	}

}
