package com.nagp.pageObjects.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.nagp.pageObjects.initializePageObjects.PageFactoryInitializer;
import com.nagp.utils.RandomGenerator;

/**
 * 
 * @author sanjeetpandit
 *
 */
public class GoogleHomePageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//a[text()='Gmail']")
	private WebElement gmailLink;

	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(name="btnK")
	private WebElement searchButton;
	
	
	public GoogleHomePageObjects clickonGmailLink() throws Exception
	{		
		click(gmailLink);
		return this;		
	}


	public GoogleHomePageObjects enterTextToSearchBox() 
	{
		searchBox.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
		return this;	
	}
	public GoogleHomePageObjects clickToSearchButton() 
	{
		searchBox.sendKeys(Keys.ENTER);
		return this;	
	}

	
	public GoogleHomePageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "Boogle");
		return this;
	}

}
