package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountcreation {
	
	
WebDriver ldriver;
	
	public Accountcreation(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, rdriver);
		
	}

	
	//identify webelements
	
	@FindBy(id="id_gender1")
	WebElement titlemrs;
	
	@FindBy(id="customer_firstname")
	WebElement custfirstname;
	
	@FindBy(id="id_gender2")
	WebElement titlems;
	
	@FindBy(id="customer_lastname")
	WebElement custlastname;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="uniform-id-state")
	WebElement state;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="phone_mobile")
	WebElement phonemobile;
	
	@FindBy(id="alias")
	WebElement alias;
	
	
	
	public void selectTitleMrs()
	{
		titlemrs.click();
	}
	
	public void entercustomerfirstname(String fname)
	{
		custfirstname.sendKeys(fname);
	}
	
	public void entercustomerlastname(String lname)
	{
		custlastname.sendKeys(lname);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void enterAddressfirstname (String fname)
	{
		address1.sendKeys(fname);
	}
	
	public void enterAddresslastname (String fname)
	{
		address1.sendKeys(fname);
	}
	public void selectstate (String text)
	{
		Select obj=new Select(state);
		obj.selectByVisibleText(text);
	}	
	public void selectcountry(String text)
	{
		Select obj=new Select(country);
		obj.selectByVisibleText(text);
	}	
	public void entermobileno(String mobile)
	{
		phonemobile.sendKeys(mobile);
	}
		
	
	}
	


}
