package com.teampulse.testCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" http://google.com");

	}

}
