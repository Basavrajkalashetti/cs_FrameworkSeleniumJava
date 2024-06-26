package com.mystore.utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfig {
	
	Properties properties;
	
	String path="C:\\Automation\\Selenim\\Mystore\\configuration\\config properties.xls";
	//constructor
	public Readconfig()
	{
		
		try {
		properties=new Properties();
		
			FileInputStream fis= new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBaseUrl()
	{
		String value= properties.getProperty("baseURL");
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getBrowser()
	{
		String value= properties.getProperty("browser");
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}

}
