package com.expedia.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUIDriver {
		
	public static WebDriver getDriver(ConfigUtils config){
		WebDriver driver = null;
		
		switch(config.BROWSER){
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "ie":
			driver = new InternetExplorerDriver();
			break;
			
		default :
			driver = new FirefoxDriver();
			
		}

		driver.get(config.URL);
		driver.manage().window().maximize();
		
		
		return driver;
	}
	

}
