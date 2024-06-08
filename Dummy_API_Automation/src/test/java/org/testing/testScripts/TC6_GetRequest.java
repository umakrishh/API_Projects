package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC6_GetRequest {
	@Test
	public void testcase6() throws IOException
	{
		System.out.println("*****Get Method is Executing*****");
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		HttpMethods http = new HttpMethods(p);
		//http.getAllMethod("QA_URI");
		//TC6_GetRequesthttp.getMethod("QA1_URI");
		http.getMethod("QA2_URI");
	}
}
