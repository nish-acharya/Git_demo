package com.teampulse.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.teampulse.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();

	public String url =readconfig.getUrl();
	public String emal=readconfig.getName();
	public String ps=readconfig.getPass();
	public static WebDriver driver;
	
	
     public void setUp()
     {
    	 System.setProperty("Webdriver.chrome.driver","./drive/chromedriver.exe" );
    	 driver= new ChromeDriver();
     }
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
