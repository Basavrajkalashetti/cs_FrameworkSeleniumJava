package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexpage {

	//create object of webdriver
	
	WebDriver ldriver;
	
	public indexpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, rdriver);
		
	}

	
	//identify webelements
	
	@FindBy(linkText="sign in")
	WebElement signIn;
	
	public void clickonSignIn()
	{
		signIn.click();
	}
}
