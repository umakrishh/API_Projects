package org.testing.utilities;

//input parameter -- Response object and filepath
//purpose of -- it will extract from response based upon jsonpath
//output parameter -- it will return the value after extraction

import io.restassured.response.Response;

public class JsonParsing {

		public static String doParsing(Response res,String jsonpath)
		{
			String responseValue = res.jsonPath().get(jsonpath);
			return responseValue;
		}
}
