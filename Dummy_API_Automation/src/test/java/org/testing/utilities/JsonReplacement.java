package org.testing.utilities;

import java.util.regex.Pattern;

//input Parameter -- Complete requestBody, variableName, variableValue
//Purpose -- to assign value to the variable of the requestbody
//output Parameter -- after replacement, requestbody it will return
public class JsonReplacement {
	
	public static String assignJsonValue(String requestBody, String variableName, String variableValue)
	{
		requestBody = requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return requestBody;
	}
}
