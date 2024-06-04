package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Accountcreation;
import com.mystore.pageobject.indexpage;
import com.mystore.pageobject.myaccount;
import com.mystore.pageobject.registeredaccount;

import junit.framework.Assert;

public class TC_Myaccountpage extends Baseclass{
	@Test
	public void verifyRegistrationAndLogin() 
	{
		driver.get(url);
		logger.info("url open");
		
		indexpage pg= new indexpage(driver);
		pg.clickonSignIn(); 
		
		myaccount pg1 =new myaccount(driver);
		
		pg1.enterCreateEmailAddress("cs123@gmail.com");
		
		pg1.clicksubmitCreate();
		
		Accountcreation accnt=new Accountcreation(driver);
		
		accnt.selectTitleMrs();
		accnt.entercustomerfirstname("prachi");
		accnt.entercustomerlastname("gupta");
		accnt.enterpassword("cs123");
		accnt.enterAddressfirstname("at andewadi");
	//	accnt.entercity("mumbai");
		accnt.selectcountry("Aalabama");
		accnt.selectstate("United sattes");
		
		
		registeredaccount reguser=new registeredaccount(driver);
		String username=reguser.getUsername();
		Assert.assertEquals("prachi", username);
		
	}
	

}
