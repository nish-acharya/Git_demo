package com.teampulse.testCases;

import org.testng.annotations.Test;

import com.teampulse.pageObjects.BaseClass;
import com.teampulse.pageObjects.LoginPage;
import com.teampulse.pageObjects.TeamPulseSettingPage;

@Test

public class SettingPageTestCase2  extends BaseClass{
    @Test 
	public void settingPage() throws InterruptedException
	{
		driver.get(url);	
	LoginPage lp = new LoginPage(driver);
	lp.setUser(emal);
	lp.setPass(ps);
	lp.signUp();
	
	TeamPulseSettingPage ts= new TeamPulseSettingPage(driver);
	ts.clickSetting();
	
	ts.startDate();
	
	
	}

	
	

}
