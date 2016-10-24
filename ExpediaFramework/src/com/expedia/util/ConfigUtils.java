package com.expedia.util;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	private static final String CONFIG_FILE = "C:\\Users\\User2\\Java\\workspace\\ExpediaFramework\\resources\\config.properties";
	
	public String BROWSER;
	public String URL;
	public static String WAIT;
	
	public ConfigUtils(){
		Properties prop = new Properties();
		
			try {
				prop.load(new FileReader(CONFIG_FILE));
				BROWSER = (String) prop.get("browser");
				URL = (String) prop.get("url");
				WAIT = (String) prop.get("wait");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
