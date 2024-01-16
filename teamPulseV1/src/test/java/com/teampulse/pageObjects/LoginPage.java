package com.teampulse.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(name="user[user_name]")
	WebElement loginName;
	
	@FindBy(name="user[password]")
	WebElement passWord;
	
	@FindBy(className="signin-btn")
	WebElement signButton;
	
	public void setUser(String email)
	{
		loginName.sendKeys(email);
		
	}
	public void setPass(String pass)
	{
		passWord.sendKeys(pass);
		
	}
	public void signUp() throws InterruptedException
	{
		signButton.click();
		Thread.sleep(3000);
		
	}
	
}
