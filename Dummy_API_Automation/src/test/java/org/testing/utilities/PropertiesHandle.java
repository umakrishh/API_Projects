 package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//input Parameter - File path
//Purpose of this method - to load the properties file
//Output Parameter - will return the object of the properties of class
public class PropertiesHandle {
	
	public static Properties LoadProperties(String Filepath) throws IOException
	{
		File f = new File(Filepath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
	}
}
