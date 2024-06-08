package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;

//input Parameter - json File path
//Purpose of this method - to read the json file
//Output Parameter - json data in string format

public class JsonHandle {

	public static String readJsonData(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject j = new JSONObject(js);
		return j.toString();
	}
}
