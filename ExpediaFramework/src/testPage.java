import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.expedia.util.WaitUtils;


public class testPage {

	WebDriver driver;
	String link = "http://www.expedia.com/" ;
	
	
	@Test
	public void testFbLogin(){
		driver = new FirefoxDriver();
		
		driver.get(link);
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement scratchPad = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/a")); 
		//WebElement scratchPad = WaitUtils.waitForAnEleToBeVisible(driver, By.id("header-history"));
		//js.executeScript("argument[0].click();", scratchPad);
		String Script = "javascript:document.getElementById('header-history').click();";
		((JavascriptExecutor) driver).executeScript(Script);
		
		String Script1 = "javascript:document.getElementByClassName('view-all-history item-link').click();";
		((JavascriptExecutor) driver).executeScript(Script1);		


		

		//WaitUtils.waitForEleToBeClickable(driver, scratchPad);
		
		/*WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.xpath(".//*[@id='globalSiteNavigation']/ul[2]/li[3]/div[2]/div/div[3]/a"));
		System.out.println(scratchPad.isDisplayed());
		
		js.executeScript("arguments[0].click();", link);
		//WebElement link = WaitUtils.waitForAnEleToBeVisible(driver, By.className("view-all-history item-link"));
		//WaitUtils.waitForEleToBeClickable(driver, link);
		
		WaitUtils.waitForPageToLoad(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		String actL = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		String expL = "https://www.expedia.com/scratchpad?rfrr=SP.Tray.SP";
		String expTitle = "Scratchpad";
		
		Assert.assertEquals(actL, expL, "Verifying My Scratchpad Button");
		Assert.assertEquals(actTitle, expTitle, "Verifying My Scratchpad Button.");
			*/	
		driver.navigate().back();
		driver.close();
		driver.quit();
		
	}

}
