package com.Vtiger;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	
	RemoteWebDriver driver;
	@Test
	
	public void remoteEx() throws MalformedURLException
	{
		URL url = new URL("http://192.168.139.1:4466/wb/hub");
		
		new DesiredCapabilities();
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability("browser","chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver rwd = new RemoteWebDriver(url,dc);
	      rwd.get("https://www.amazon.in/");
		}

	     
	}
	


