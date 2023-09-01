
package org.gc.javaexpert.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileLoader {
	static Properties prop;
	static {
		load();
	}

	public static void load() {
		prop = new Properties();
		String propertiesFile = "";
		try {
			propertiesFile = System.getProperty("user.dir") + File.separatorChar + "TradeConfig" + File.separatorChar + "config.properties";
			System.out.println("Config Property File Path : "+propertiesFile);
			prop.load(new FileInputStream(new File(propertiesFile)));
			System.out.println(" Config Property File Path : "+propertiesFile+" loaded successfully.");
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException : Unable to find "+propertiesFile);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		return prop.getProperty(key, defaultValue);
	}
}
