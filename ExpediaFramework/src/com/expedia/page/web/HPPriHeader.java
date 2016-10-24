package com.expedia.page.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.expedia.base.BasePage;
import com.expedia.util.ConfigUtils;
//import com.expedia.util.WaitUtils;
import com.expedia.util.WaitUtils;


public class HPPriHeader extends BasePage {
	
	ConfigUtils config = new ConfigUtils();
	HPPHFunctions hpphf = new HPPHFunctions();

	public HPPriHeader(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyPriHeader(){
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li"));
		Reporter.log("Number of header links are "+links.size()+"<br>"+"<br>");
		Assert.assertEquals(links.size(), 7, "Verify number of links at Header.");
		
		//For Bell Button
		hpphf.verifyBell(driver, links.get(0));
		
		//For Account button
		hpphf.verifyAccount1(driver, links.get(1));
		hpphf.verifyAccount2(driver, links.get(1));
		hpphf.verifyAccount3(driver, links.get(1));
		
		//For My Scratchpad Button
		WebElement scratchPad = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/a")); 
		hpphf.scratchPad1(driver, scratchPad);
		//WebElement scratchPad2 = WaitUtils.waitForRefresh(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/a"));
		//hpphf.scratchPad2(driver, scratchPad2);
		
		//For My Trips Link
		WebElement myTrips = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-itineraries"));
		hpphf.myTrips(driver, myTrips);
		
		//For Support Menu
		WebElement support = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-support-menu"));
		hpphf.supportMenu1(driver, support);
		
		WebElement support2 = WaitUtils.waitForRefresh(driver, By.id("header-support-menu"));
		hpphf.supportMenu2(driver, support2);
		
		//For Espanol Link
		WebElement lang2 = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-language-2058"));
		hpphf.lang2(driver, lang2);;
		
		//For Japanise Link
		WebElement lang3 = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='header-language-2052']"));
		hpphf.lang3(driver, lang3);
	
		
	}
	

}
