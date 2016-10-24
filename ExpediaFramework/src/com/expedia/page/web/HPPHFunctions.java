package com.expedia.page.web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.expedia.util.WaitUtils;

public class HPPHFunctions {
	
	public void verifyBell(WebDriver driver, WebElement bell){
		WaitUtils.waitForEleToBeClickable(driver, bell);
		String expMsg = "Your notifications";
		
		Assert.assertTrue((bell.getText()).contains(expMsg), "Verifying Bell Alert.");
				
		Reporter.log("Bell Link Verified:  "+ bell.getText()+"<br>"+"<br>");	
		
	}
	
	public void verifyAccount1(WebDriver driver, WebElement account){
		WaitUtils.waitForEleToBeClickable(driver, account);
		WebElement message = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-exclusive-deals"));
		
		String actMsg = message.getText();
		String expMsg = "Sign in to see exclusive Member Pricing.";
		
		Assert.assertTrue(actMsg.contains(expMsg), "Verifying Account button.");
		
		Reporter.log("Account Button : Sign In Text Verified."+"<br>"+"<br>");
	}
	
	public void verifyAccount2(WebDriver driver, WebElement account){
		WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-account-signin-button"));
		WaitUtils.waitForEleToBeClickable(driver, link);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/user/signin?ckoflag=0";
		String expTitle = "Sign In";
		
		Assert.assertEquals(actL, expL, "Verifying Account Button");
		Assert.assertEquals(actTitle, expTitle, "Verifying Account Button.");
		
		driver.navigate().back();
		Reporter.log("Account Button : Sign In link Verified."+"<br>"+"<br>");
	}
	
	public void verifyAccount3(WebDriver driver, WebElement account){
		WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-account-register"));
		WaitUtils.waitForEleToBeClickable(driver, link);
		WaitUtils.waitForPageToLoad(driver);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/user/createaccount?fromheader=true";
		String expTitle = "Create an account";
		
		Assert.assertEquals(actL, expL, "Verifying Account Button");
		Assert.assertEquals(actTitle, expTitle, "Verifying Account Button.");
		
		driver.navigate().back();
		Reporter.log("Account Button : Create Account link Verified."+"<br>"+"<br>");
	}
	
	public void scratchPad1(WebDriver driver, WebElement scratchPad){
		WaitUtils.waitForEleToBeClickable(driver, scratchPad);
		WebElement message = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/div[2]/div/div[1]/p[1]"));
		
		String actMsg = message.getText();
		String expMsg = "Things you view while shopping are saved here.";
		
		Assert.assertTrue(actMsg.contains(expMsg), "Verifying My Scratchpad button.");
		
		Reporter.log("My Scratchpad Button : Text Verified."+"<br>"+"<br>");
	}
	
	public void scratchPad2(WebDriver driver, WebElement scratchPad){
		WaitUtils.waitForEleToBeClickable(driver, scratchPad);
		WebElement link = driver.findElement(By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/div[2]/div/div[3]/a"));
		link.click();
		//WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.className("view-all-history item-link"));
		//WaitUtils.waitForEleToBeClickable(driver, link);
		
		WaitUtils.waitForPageToLoad(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/scratchpad?rfrr=SP.Tray.SP";
		String expTitle = "Scratchpad";
		
		Assert.assertEquals(actL, expL, "Verifying My Scratchpad Button");
		Assert.assertEquals(actTitle, expTitle, "Verifying My Scratchpad Button.");
				
		driver.navigate().back();
		Reporter.log("My Scratchpad Button : link Verified."+"<br>"+"<br>");
	}
	public void myTrips(WebDriver driver, WebElement myTrips){
		WaitUtils.waitForEleToBeClickable(driver, myTrips);
		WaitUtils.waitForPageToLoad(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/user/itin?ckoflag=0&selc=0&uurl=qscr%3Dreds%26rurl%3D%252Ftrips";
		String expTitle = "View my Itinerary";
		
		Assert.assertEquals(actL, expL, "Verifying My Trips Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying My Trips Link.");
		
		driver.navigate().back();
		Reporter.log("My Trips Link Verified."+"<br>"+"<br>");
	}
	public void supportMenu1(WebDriver driver, WebElement support){
		WaitUtils.waitForEleToBeClickable(driver, support);
		WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-support-cs"));
		WaitUtils.waitForEleToBeClickable(driver, link);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/service/";
		String expTitle = "Customer Service Portal";
		
		Assert.assertEquals(actL, expL, "Verifying Support Customer Support Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Support Customer Support Link.");
		
		driver.navigate().back();
		Reporter.log("Support Menu1 : Customer Suuport link verified."+"<br>"+"<br>");
	}
	public void supportMenu2(WebDriver driver, WebElement support){
		WaitUtils.waitForEleToBeClickable(driver, support);
		WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-support-feedback"));
		WaitUtils.waitForEleToBeClickable(driver, link);
		WaitUtils.waitForPageToLoad(driver);
		
		Set<String> AllWindowHandles = driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		String window2 = (String) AllWindowHandles.toArray()[1];
	
		driver.switchTo().window(window2);
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/p/info-other/feedback.htm?";
		String expTitle = "Feedback";
		
		Assert.assertTrue(actL.contains(expL), "Verifying Support Feedback Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Support Feedback Link.");
		//driver.close();
		
		driver.switchTo().window(window1);
		Reporter.log("Support Menu2 : Customer Suuport link verified."+"<br>"+"<br>");
	}
	
	public void lang2(WebDriver driver, WebElement lang2){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click();", lang2);
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/?&langid=2058";
		String expTitle = "Expedia: Hoteles, vuelos, renta de autos y cruceros | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Language2 Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Language2 Link.");
		
		driver.navigate().back();
		Reporter.log("Language2 : Language2 link verified."+"<br>"+"<br>");
	}
	
	public void lang3(WebDriver driver, WebElement lang3){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click();", lang3);
		
		String actL = driver.getCurrentUrl();
		String expL = "https://www.expedia.com/?&langid=2052";
		
		Assert.assertEquals(actL, expL, "Verifying Language3 Link.");
		
		driver.navigate().back();
		Reporter.log("Language2 : Language2 link verified."+"<br>"+"<br>");
	}
	
}