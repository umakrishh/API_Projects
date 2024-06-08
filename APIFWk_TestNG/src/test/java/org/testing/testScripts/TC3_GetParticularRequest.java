package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetParticularRequest {
	@Test
	public void testcase3() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../APIFWk/URI.properties");
		HttpMethods http = new HttpMethods(p);
		http.getParticularMethod("QA_URI",TC1_PostRequest.returnIDValue);
	}

}
