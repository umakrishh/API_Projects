package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String returnIDValue;
	@Test
	public void testcase1() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../APIFWk/URI.properties");
		String requestBody = JsonHandle.readJsonData("../APIFWk/src/test/java/org/testing/resources/requestBody.json");
		System.out.println("Please enter the id value");
		Scanner s = new Scanner(System.in);
		Integer idValue = s.nextInt();		
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", idValue.toString());
		HttpMethods http = new HttpMethods(p);
		Response resobj = http.postMethod(requestBody, "QA_URI");
		returnIDValue = JsonParsing.doParsing(resobj, "id");
		s.close();
	}
}
