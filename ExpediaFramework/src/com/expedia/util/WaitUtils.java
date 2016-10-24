package com.expedia.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	
	//waits until element click able 
	//parameters WebDriver and element
	public static void waitForEleToBeClickable(WebDriver driver, WebElement ele){
		
		try {
			

			WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigUtils.WAIT).longValue());
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			element.click();
			waitForPageToLoad(driver);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch(TimeoutException e){
			e.printStackTrace();

		}
		
	}
	
	//waits until the page loads
	//parameter WebDriver
	public static void waitForPageToLoad(WebDriver driver){
		try {
			WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigUtils.WAIT).longValue());
			ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver driver){
					return ((JavascriptExecutor) driver).executeScript( 
							"return document.readyState").equals("complete");
					
				}
			};	
			wait.until(expectation);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	//waits for an element to be visible
	//parameters WebDriver, By locator
	public static WebElement waitForAnEleToBeVisible(WebDriver driver, By locator){
		WebElement element = null;
		WaitUtils.waitForPageToLoad(driver);
		for(int i=0; i<=2; i++){
			try {
				WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigUtils.WAIT).longValue());
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
				break;
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}catch(TimeoutException e){
				e.printStackTrace();
			}
			
		}
		return element;
		}
	
	//waits for refreshing the page (avoid stale element reference)
	//parameter WebDriver, By locator
	public static WebElement waitForRefresh(WebDriver driver, By locator){
		int counter = 0;
		try {
			counter = counter+1;
			waitForPageToLoad(driver);
			return driver.findElement(locator);
		} catch (StaleElementReferenceException e) {
			return waitForRefresh(driver, locator);
		}
		
		
	}
	

}