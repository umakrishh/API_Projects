package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_deleteRequest {
	@Test
	public void testcase5() throws IOException
	{
		System.out.println("*****Delete Method is Executing*****");
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		HttpMethods http = new HttpMethods(p);
		http.deleteMethod("QA3_URI",TC1_PostRequest.returnIDValue);
	}
}
