package LearnConfigAnnotationsWithBaseClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.BaseClass.BaseClassForCRM;
import com.CRM.Generic.ListenerUtility.ListenerClassForCRM;
@Listeners(ListenerClassForCRM.class)
public class TestScriptForOrg extends BaseClassForCRM {

	@Test(retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void executeForCreatingOrg() {
		System.out.println("TC_003--->Creating ORG got Executed....");
	}
	@Test(retryAnalyzer = com.CRM.Generic.ListenerUtility.ListenerClassForCRM.class)
	public void executeForCreatingOrgWithIndustry() {
		System.out.println("TC_004--->Creating ORG with Industry got Executed....");
	}

}
