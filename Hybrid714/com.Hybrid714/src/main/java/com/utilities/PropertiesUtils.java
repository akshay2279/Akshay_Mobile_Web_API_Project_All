package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtils {

	
	public static String readproperty(String key) {
		FileInputStream fis= null;
		String path = System.getProperty("user.dir")+"/src/main/resources/config.properties";
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
	}
	
}
