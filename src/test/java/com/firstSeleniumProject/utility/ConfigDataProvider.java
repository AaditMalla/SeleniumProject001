package com.firstSeleniumProject.utility;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider()
	{
	File src = new File("./Configurations/config.properties");

	try {
	FileInputStream fis= new FileInputStream(src);

	pro= new Properties() ;

	pro.load (fis);
	} catch (Exception e) {
	System. out.println ("Not able to load config file "+e.getMessage());

	}

	}

	public String getBrowser () {
	// TODO Auto-generated method stub
	return pro.getProperty("browser");

	}

	public String getStagingUrl () {
	// TODO Auto-generated method stub
	return pro.getProperty("testurl2");
	}
}
