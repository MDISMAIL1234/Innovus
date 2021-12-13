package com.vtiger.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImClass  implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		String testNAme = result.getMethod().getMethodName();
		String currentDate= new Date().toString().replace(":", "_").replace(" ", "_");
		System.out.println(testNAme +"=======Excute & i am Listnenig======");
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(Baseclass.sDriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("./screenshot/"+testNAme+currentDate+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
