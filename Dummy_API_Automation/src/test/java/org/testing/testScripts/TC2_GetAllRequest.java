package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAllRequest {
	@Test
	public void testcase2() throws IOException
	{
		System.out.println("*****GetAll Method is Executing*****");
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		HttpMethods http = new HttpMethods(p);
		//http.getAllMethod("QA_URI");
		http.getAllMethod("QA3_URI");
	}
}
