import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.expedia.util.WaitUtils;


public class testPage2 {
	WebDriver driver;
	String link = "http://www.expedia.com/" ;
	
	@Test
	public void expediaTest(){
		driver = new FirefoxDriver();
		
		driver.get(link);
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='home-page']/div[3]/div[2]/div/div/ul/li"));
		System.out.println("Number of header links are "+links.size());
		//System.out.println(links.get(1).isDisplayed());
		
		//WaitUtils.waitForEleToBeClickable(driver, links.get(1));
		links.get(10).click();
		//WebElement bundleDeals =WaitUtils.waitForAnEleToBeVisible(driver, By.id("primary-header-package"));
		//WaitUtils.waitForEleToBeClickable(driver, bundleDeals);
		
		//WaitUtils.waitForPageToLoad(driver);
		//WebElement bundleDeals = driver.findElement(By.id("primary-header-package"));
		//bundleDeals.click();
		//String actL = driver.getCurrentUrl();
		//String actTitle = driver.getTitle();
		//String expL = "https://www.expedia.com/app";
		//String expTitle = "Travel Apps: Best Hotel & Flight Booking Apps For Your iPhone, Android & iPad | Expedia";
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//Assert.assertEquals(actL, expL, "Verifying Bundle Deals Link.");
		//Assert.assertEquals(actTitle, expTitle, "Verifying Bundle Deals Link.");
		
		driver.navigate().back();
		//System.out.println(bundleDeals.isDisplayed());
		//Reporter.log("Bundle Deal Link : Bundle Deals Link Verified."+"<br>"+"<br>");
		
		driver.close();
		driver.quit();
	}

}
