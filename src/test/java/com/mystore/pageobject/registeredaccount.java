package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredaccount {

	
WebDriver ldriver;
	
	public registeredaccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, rdriver);
		
	}

	
	//identify webelements
	
	@FindBy(xpath="//a[@title='view my customer account']")
	WebElement username;
	
	public String getUsername()
	{
	  String text=username.getText();
	  return text;
	}

	
	
	
	
	
	
	
}



