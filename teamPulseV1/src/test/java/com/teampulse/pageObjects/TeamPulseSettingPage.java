package com.teampulse.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TeamPulseSettingPage {
    WebDriver driver;
    
    
	
	public TeamPulseSettingPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy(xpath="//div[@class='_eng-sidebarIcon-left bubble-icon-settings-1']")
	WebElement setting;
	
	@FindBy(xpath="//*[@id=\"team-checkin\"]/a")
	WebElement teamsetting;
	
	@FindBy(xpath="(//input[@placeholder= \"Select Date\"])[1]")
	WebElement startdate;
	
	
	
	@FindBy(xpath="(//select[@class='monthselect'])[1]")
	WebElement month;
	
	@FindBy(xpath="(//select[@class='yearselect'])[1]")
	WebElement year;
	
	@FindBy(xpath="//td[.='3']")
	WebElement date;
	
	
	public void clickSetting() throws InterruptedException
	{
		setting.click();
		teamsetting.click();
		Thread.sleep(5000);
	}

	
	public void startDate() throws InterruptedException
	{   
		startdate.click();
		Select select1 = new Select(month);
		select1.selectByVisibleText("Nov");
		Select select2 = new Select(month);
		select2.selectByVisibleText("2023");
		date.click();
		Thread.sleep(2000);
	}
	

}
