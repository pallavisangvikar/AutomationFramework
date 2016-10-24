package com.expedia.page.web;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.expedia.base.BasePage;
import com.expedia.util.ConfigUtils;
import com.expedia.util.WaitUtils;
public class HPPriSecHeader extends BasePage {
	
	ConfigUtils config = new ConfigUtils();

	public HPPriSecHeader(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyPriSecLink(){
		WebElement secLink = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='home-page']/div[3]/div[1]/div[3]/div/a"));
		
		String parent = driver.getWindowHandle();
		
		WaitUtils.waitForEleToBeClickable(driver, secLink);
		WaitUtils.waitForPageToLoad(driver);
		
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles){
			   if(!windowHandle.equals(parent)){
				   driver.switchTo().window(windowHandle);
			   }
		   }
		   
		WaitUtils.waitForPageToLoad(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/app?mcicid=USDouble";
		String expTitle = "Travel Apps: Best Hotel & Flight Booking Apps for your iPhone, Android & iPad | Expedia";
		
		Assert.assertEquals(actL, expL, "Verifying Secondary Header Link.");
		Assert.assertEquals(actTitle, expTitle, "Verifying Secondary Header Link.");
		
		driver.switchTo().window(parent);
		Reporter.log("Secondary Header link Verified."+"<br>"+"<br>");
			
	}

}
