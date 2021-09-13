package com.Zenus.GenericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class  BaseTest implements IAutoConsts{
	
	public static WebDriver driver;
	public void openBrowser() throws Throwable
	{
		
		System.setProperty(GECKO_KEY ,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
//		FileLib flib=new FileLib();
//		String appURL=flib.readpropertyData(PROP_PATH, "url");
		driver.get("http://192.168.160.128:8080/crm/HomePage.do");
	
	}
	public void closeBrowser()
	{
		driver.quit();
		
		
		
	}

}
