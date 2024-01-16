package com.teampulse.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig()
	{
		File src = new File("C:\\Users\\nischitha.dn\\eclipse-workspace\\teamPulseV1\\Configuration\\config.properties");
		try
		{
		   FileInputStream fl = new FileInputStream(src);
		    prop = new Properties();
			prop.load(fl);
			
			
		}catch(Exception e)
		
		{
			System.out.println("exception is " + e.getMessage());
		}
	}
	public String getUrl()
	{
		String url = prop.getProperty("url");
		return url;
		
	}
	public String getName()
	{
		String email = prop.getProperty("emal");
		return  email;
		
	}
	public String getPass()
	{
		String pass = prop.getProperty("ps");
		return pass;
		
	}
}
