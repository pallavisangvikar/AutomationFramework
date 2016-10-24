package com.expedia.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.expedia.util.ConfigUtils;
import com.expedia.util.WebUIDriver;

public abstract class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		ConfigUtils config = new ConfigUtils();
		this.driver = WebUIDriver.getDriver(config);	
	}
}
