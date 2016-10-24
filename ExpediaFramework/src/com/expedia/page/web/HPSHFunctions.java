package com.expedia.page.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.expedia.util.WaitUtils;

public class HPSHFunctions {

	public void verifyBundleDeals(WebDriver driver, WebElement bundleDeals){
		WaitUtils.waitForEleToBeClickable(driver, bundleDeals);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Vacation-Packages";
		String expTitle = "Vacation Packages: Find Cheap Vacations & Travel Packages | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Bundle Deals Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Bundle Deals Link.");
		
		driver.navigate().back();
		Reporter.log("Bundle Deal Link : Bundle Deals Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyHotels(WebDriver driver, WebElement hotels){
		WaitUtils.waitForEleToBeClickable(driver, hotels);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Hotels";
		String expTitle = "Hotels: Search Cheap Hotel Deals, Discounts, & Reservations | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Hotels Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Hotels Link.");
		
		driver.navigate().back();
		Reporter.log("Hotels Link : Hotels Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyCars(WebDriver driver, WebElement cars){
		WaitUtils.waitForEleToBeClickable(driver, cars);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Cars";
		String expTitle = "Car Rental: Find Rental Car Deals & Cheap Car Rentals | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Cars Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Cars Link.");
		
		driver.navigate().back();
		Reporter.log("Cars Link : Cars Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyFlights(WebDriver driver, WebElement flights){
		WaitUtils.waitForEleToBeClickable(driver, flights);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Flights";
		String expTitle = "Cheap Flights: Find One-Way Airline Tickets & Airfare Deals | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Flights Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Flights Link.");
		
		driver.navigate().back();
		Reporter.log("Flights Link : Flights Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyCruises(WebDriver driver, WebElement cruises){
		WaitUtils.waitForEleToBeClickable(driver, cruises);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Cruises";
		String expTitle = "Cruises: Find Cheap Cruise Deals & Last Minute Cruises | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Cruises Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Cruises Link.");
		
		driver.navigate().back();
		Reporter.log("Cruises Link : Cruises Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyThingsToDo(WebDriver driver, WebElement things){
		WaitUtils.waitForEleToBeClickable(driver, things);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Activities";
		String expTitle = "Things To Do Near Me: Find Fun Activities Nearby | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Things To Do Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Things To Do Link.");
		
		driver.navigate().back();
		Reporter.log("Things To Do Link : Things To Do Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyVacationRentals(WebDriver driver, WebElement vacRentals){
		WaitUtils.waitForEleToBeClickable(driver, vacRentals);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/vacation-rentals/";
		String expTitle = "Vacation Rentals: Short-term Apartments for Rent | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Vacation Rentals Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Vacation Rentals Link.");
		
		driver.navigate().back();
		Reporter.log("Vacation Rentals Link : Vacation Rentals Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyDeals(WebDriver driver){
		WebElement deals = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='primary-header-deals']"));
		WaitUtils.waitForPageToLoad(driver);
		WaitUtils.waitForEleToBeClickable(driver, deals);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/Deals";
		String expTitle = "Travel Deals: Find Cheap Deals on Travel, Trips & Tours | Expedia.com";
		
		Assert.assertEquals(actL, expL, "Verifying Deals Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Deals Link.");
		
		driver.navigate().back();
		Reporter.log("Deals Link : Deals Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyRewards(WebDriver driver){
		WebElement rewards = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='primary-header-rewards']"));
		WaitUtils.waitForPageToLoad(driver);
		WaitUtils.waitForEleToBeClickable(driver, rewards);
		WaitUtils.waitForPageToLoad(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/rewards/howitworks";
		String expTitle = "Expedia+: Learn How it Works to Earn Travel & Hotel Benefits | Expedia.com";
		
		Assert.assertEquals(actL, expL, "Verifying Rewards Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Rewards Link.");
		
		//driver.navigate().back();
		WebElement home = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='primary-header-home']"));
		WaitUtils.waitForEleToBeClickable(driver, home);

		Reporter.log("Rewards Link : Rewards Link Verified."+"<br>"+"<br>");
	}
	
	public void verifyMobile(WebDriver driver){
		WebElement mobile = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='primary-header-mobile']"));
		WaitUtils.waitForPageToLoad(driver);
		WaitUtils.waitForEleToBeClickable(driver, mobile);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/app";
		String expTitle = "Travel Apps: Best Hotel & Flight Booking Apps for your iPhone, Android & iPad | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Mobile Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Mobile Link.");
		
		driver.navigate().back();
		Reporter.log("Mobile Link : Mobile Link Verified."+"<br>"+"<br>");
	}

}
