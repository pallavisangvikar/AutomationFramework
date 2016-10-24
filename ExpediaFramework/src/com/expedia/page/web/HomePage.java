package com.expedia.page.web;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.expedia.base.BasePage;
import com.expedia.util.ConfigUtils;
import com.expedia.util.WaitUtils;


public class HomePage extends BasePage {
	
	
	ConfigUtils config = new ConfigUtils();

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyHomepage(){
		//WaitUtils.waitForPageToLoad(driver);
		
		String expLink = config.URL;
		String actLink = driver.getCurrentUrl();
		
		Reporter.log("Expected Link : "+expLink+"<br>");
		Reporter.log("Actual link : "+actLink+"<br>");
		Reporter.log("Page Title : "+driver.getTitle()+"<br>");
		Reporter.log("Expedia Home Page Verified."+"<br>");
		Assert.assertTrue(expLink.equalsIgnoreCase(actLink),"Expedia Home Page - link Test");
	
	}
	
	
	
	public void verifyHeaderBanner(){
		 //WaitUtils.waitForPageToLoad(driver);
		//WebElement banner = driver.findElement(By.id("join-rewards-banner"));
		
		WebElement img = driver.findElement(By.xpath(".//*[@id='join-rewards-banner']/img"));
		Assert.assertTrue(img.isDisplayed(), "Verifying Banner Expedia Logo.");
		Reporter.log("Logo on Expedia Banner is verified." +"<br>");
		
		String oldWin = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.xpath(".//*[@id='rewardsPricingNames']/a"));
		link.click();
		
		ArrayList<String> newWin = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(newWin.get(0));
		WaitUtils.waitForPageToLoad(driver);

		//WebElement text = driver.findElement(By.xpath(".//*[@id='page-header']/h1"));
		//String title = text.getText();
		Reporter.log(driver.getTitle() +"<br>");
		//Assert.assertTrue(title.equalsIgnoreCase("Create Your Free Account"), "Verifying new tab.");
		driver.close();
		driver.switchTo().window(oldWin);
		
		WebElement button = driver.findElement(By.xpath(".//*[@id='join-rewards-close-btn']/span[1]"));
		button.click();
		WebElement bannernew = driver.findElement(By.xpath(".//*[@id='join-rewards-banner']"));
		boolean visible = bannernew.isDisplayed();
		

		//Assert.assertTrue(visible, "Verifying Header Banner.");
		Assert.assertEquals(button.isDisplayed(), visible);
		Reporter.log("Expedia Header Banner Verified."+"<br>");

		

	}
	public void verifyHeaderPrimary(){
		WebElement headerPri = driver.findElement(By.xpath(".//*[@id='home-page']/div[3]/div[1]"));
		//Verify Primary Row 1 Expedia logo
		WebElement logo = headerPri.findElement(By.id("header-logo"));
		WebElement we = logo.findElement(By.tagName("img"));
		 		 
		WaitUtils.waitForEleToBeClickable(driver, we);
		WaitUtils.waitForPageToLoad(driver);
		 
		String expLink = config.URL;
		String actLink = driver.getCurrentUrl();
		Reporter.log("Expected Link : "+expLink+"<br>");
		Reporter.log("Actual link : "+actLink+"<br>"); 
		Reporter.log("Expedia Logo Verified."+"<br>");
		 
		Assert.assertTrue(expLink.equalsIgnoreCase(actLink), "Verifying Header Logo link.");
		
		//Verify Primary Row 1 links
		
		//WaitUtils.waitForPageToLoad(driver);
		/*List<WebElement> links = driver.findElements(By.xpath(".//*[@class = 'shop-nav nav-group cf']/li"));				
		Reporter.log("Number of header links are "+links.size()+"<br>");
		
		Assert.assertEquals(links.size(), 7, "Verify number of links at Header.");
		//Verify Primary Row 1 Bell link
		WebElement bell = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='user-alerts-menu']/ul/li/button"));
		WaitUtils.waitForEleToBeClickable(driver, bell);
		String expMessage = "You have 1 notification";
		System.out.println("Bell Element fount.");
		Assert.assertTrue((bell.getText()).contains(expMessage), "Verifying Bell Alert.");
		Reporter.log("Bell Link Verified."+"<br>");*/
		//Verify Primary Row 1 Account link
		/*		
		WebElement account = driver.findElement(By.id("header-account-menu"));
		
		WaitUtils.waitForEleToBeClickable(driver, account);
		account.click();
		
		System.out.println("Account click.");
		String expMsg = "Sign in to see exclusive Member Pricing.";
		WebElement message = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='header-exclusive-deals']"));
		String actMsg = message.getText();
		Assert.assertTrue(actMsg.contains(expMsg), "Verifying Account button.");
		System.out.println("Message element is : "+message);
				
		WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='utility-menu']/div/ul/li[2]/button"));
		WaitUtils.waitForEleToBeClickable(driver, account);
		link.click();
		WaitUtils.waitForPageToLoad(driver);
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/user/signin?ckoflag=0";
		String expTitle = "Sign in or select an option";
		Reporter.log(actL +"<br>"+actTitle+"<br>");
		Assert.assertEquals(actL, expL, "Verifying Account Button");
		Assert.assertEquals(actTitle, expTitle, "Verifying Account Button.");
		
		Reporter.log("Account button Verified.");
		*/
		//Verify Primary Row 1 My Scratchpad
		
		//WebElement scratchPad = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='header-history']"));
		//scratchPad.click();
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[4]/div[2]/div/div"));
		//List<WebElement> links = driver.findElements(By.id("globalSiteNavigation"));
		int size = links.size();
		System.out.println("Size : "+size);
		String actText = driver.findElement(By.className("greeting-message")).getText();
		String expText = "Things you view while shopping are saved here.";
		System.out.println("Message : "+actText);
		Assert.assertEquals(actText, expText, "Verifying My Scratchpad Link");
		/*
		scratchPad.click();
		WebElement Link = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[4]/div[2]/div/div[3]/a"));
		Link.click();
		String actL = driver.getCurrentUrl();
		String expL = "https://www.expedia.com/scratchpad?rfrr=SP.Tray.SP";
		System.out.println("Link : "+actL);
		Assert.assertEquals(actL, expL, "Verifying My Scratchpad Link");
		Reporter.log("My Scratchpad Verified.");
		*/
		
	}
	
	/*public String getLinkText(WebElement we){
		String actText = "";
		return actText;
	}
	
	public String getPageTitle(){
		String title = "";
		return title;
	}

	*/
	
	
	

}
