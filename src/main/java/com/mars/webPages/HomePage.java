package com.mars.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
		//Hello Test test123
		//hello
		
		//Hello
	
	}

	@FindBy(css = "a[href='/abtest']")
	private WebElement abTestLink;
	
	@FindBy(css = ".example h3")
	private WebElement headingOfABTest;
	
	public void clickOnLink(WebElement element) {
		element.click();
	}
	
	public void clickOnABTestLink() {
		clickOnLink(abTestLink);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	
	public String getHeadingABTest() {
		return headingOfABTest.getText();
	}
}
