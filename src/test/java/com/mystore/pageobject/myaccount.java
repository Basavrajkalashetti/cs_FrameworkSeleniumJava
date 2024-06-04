package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount {
	
	WebDriver ldriver;
	
public myaccount(WebDriver rdriver )
{
	ldriver=rdriver;
	
	PageFactory.initElements(rdriver, rdriver);
}

@FindBy(id="email_create")
WebElement createEmailid;

@FindBy(id="SubmitCreate")
WebElement SubmitCreate;
public void enterCreateEmailAddress(String emailAdd) {
	
	createEmailid.sendKeys(emailAdd);
}

public void clicksubmitCreate() {
	
	SubmitCreate.click();
	
}
}
