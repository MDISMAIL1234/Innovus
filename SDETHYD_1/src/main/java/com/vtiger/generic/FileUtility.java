package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	/**
	 * This Method will read the data from prop file
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	public  String readDatafromPropfiles(String Key) throws IOException
	{
		FileInputStream fis =new FileInputStream("./config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(Key);

}
}
