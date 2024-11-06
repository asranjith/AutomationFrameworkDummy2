package LearnConfigAnnotationsWithBaseClass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.Generic.ListenerUtility.ListenerClassForCRM;
@Listeners(ListenerClassForCRM.class)
public class TestScriptForContacts extends BaseClassForCRM {

	@Test(retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void executeForCreatingContact() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "HRM");
		System.out.println("TC_001--->Creating Contact got Executed....");
	}
	@Test(retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void executeForCreatingContactWithDate() {
		System.out.println("TC_002--->Creating Contact with Date got Executed....");
	}

}
