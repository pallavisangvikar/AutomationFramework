package com.expedia.test.web;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.expedia.base.BaseTest;
import com.expedia.page.web.HPPriHeader;
import com.expedia.page.web.HPPriSecHeader;
import com.expedia.page.web.HPSecHeader;
//import com.expedia.page.web.HomePage;

public class HomePageTest extends BaseTest {
	//private HomePage hp;
	private HPPriHeader hpph;
	private HPPriSecHeader hppsh;
	private HPSecHeader hpsh;
	
	@BeforeClass
	public void beforeClass(){
		//hp = new HomePage(driver);
		hpph = new HPPriHeader(driver);
		hppsh = new HPPriSecHeader(driver);
		hpsh = new HPSecHeader(driver);
	}	
	
	/*@Test
	public void testVerifyHomePage(){
		hp.verifyHomepage();
	}
	@Test
	public void testVerifyLogo(){
		hp.verifyLogo();	
	}*/
	/*@Test
	public void testVerifyHeaderBanner(){
		hp.verifyHeaderBanner();
	}*/
	/*@Test
	public void testVerifyHeaderLinks(){
		hp.verifyHeaderPrimary();
		
	}*/
	/*@Test
	public void testPriHeadLinks(){
		hpph.verifyPriHeader();;
	}
	@Test
	public void testPSecHeadLink(){
		hppsh.verifyPriSecLink();;
	}*/
	@Test
	public void testSecHeaderLinks(){
		hpsh.verifySecHeader();
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	

}
