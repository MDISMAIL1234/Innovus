package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest {
	@Test
	
	public void readDatafromCMD() {
		String url=System.getProperty("url");
		WebDriver  driver = new FirefoxDriver();
		driver.get(url);
		
		
	}

}
