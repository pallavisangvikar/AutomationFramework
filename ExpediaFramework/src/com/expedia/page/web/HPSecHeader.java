package com.expedia.page.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.expedia.base.BasePage;
import com.expedia.util.ConfigUtils;

public class HPSecHeader extends BasePage {
	
	ConfigUtils config = new ConfigUtils();
	HPSHFunctions hpshf = new HPSHFunctions();

	public HPSecHeader(WebDriver driver) {
		super(driver);
	}
	public void verifySecHeader(){
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='home-page']/div[3]/div[2]/div/div/ul/li"));
		Reporter.log("Number of secondary header links are "+links.size()+"<br>"+"<br>");
		Assert.assertEquals(links.size(), 12, "Verify number of links at Header.");
		
		//For Bundle Deals Link
		hpshf.verifyBundleDeals(driver, links.get(1));
		
		//For Hotels Link
		hpshf.verifyHotels(driver, links.get(2));
		
		//For Cars Link
		hpshf.verifyCars(driver, links.get(3));
		
		//For Flights Link
		hpshf.verifyFlights(driver, links.get(4));
		
		//For Cruises Link
		hpshf.verifyCruises(driver, links.get(5));
		
		//For Things To Do Link
		hpshf.verifyThingsToDo(driver, links.get(6));
		
		//For Vacation Rentals Link
		hpshf.verifyVacationRentals(driver, links.get(7));
		
		//For Deals Link
		hpshf.verifyDeals(driver);
		
		//For Rewards Link
		hpshf.verifyRewards(driver);
		
		//For Mobile Link
		hpshf.verifyMobile(driver);
		
		
	}
	
	

}
