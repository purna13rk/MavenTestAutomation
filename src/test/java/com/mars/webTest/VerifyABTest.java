package com.mars.webTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;

import com.mars.Automation.BaseTest;
import com.mars.webPages.HomePage;

public class VerifyABTest extends BaseTest{
	public HomePage homePage;
	
	@BeforeTest
	public void initialize() {
		homePage = new HomePage(driver);
	}
	
	@Test
	public void abTest() {
		SoftAssert sa = new SoftAssert();
		homePage.clickOnABTestLink();
		//sa.assertEquals("The Interne", homePage.getTitleOfThePage());
		Assert.assertEquals("The Internet", homePage.getTitleOfThePage());
		
		System.out.println("test ========" + homePage.getHeadingABTest().contains("A/B Test"));
		Assert.assertEquals(true, homePage.getHeadingABTest().contains("A/B Test"));
		sa.assertAll();
		
	}
}
