package com.teampulse.testCases;

import org.testng.annotations.Test;

import com.teampulse.pageObjects.BaseClass;
import com.teampulse.pageObjects.LoginPage;

public class LoginTestCse1 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(url);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUser(emal);
		lp.setPass(ps);
		lp.signUp();
		
		
	}
	

}
