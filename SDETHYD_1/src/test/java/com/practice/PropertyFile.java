package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis =new FileInputStream("..\\SDETHYD_1\\Commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String propvalue=prop.getProperty("url");
		System.out.println(propvalue);
		
		
		
		

	}

}
