package com.Vtiger;

//import java.io.File;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.mysql.jdbc.Driver;
//import com.vtiger.generic.Baseclass;
//import com.vtiger.generic.LisImClass;
//
//import junit.framework.Assert;
//@Listeners(com.vtiger.
//
//public class SimpleTest extends Baseclass {
//	
//	@Test
//	public void verifyHomePage(Method mtd) throws Throwable {
//		System.out.println(mtd.getName());
//		String currentTestNAme= mtd.getName();
//		System.out.println("=======Test START======");
//		
//		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
//		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
//		File dstFile = new File("./screenshot/"+currentTestNAme+".png");
//		FileUtils.copyFile(srcFile,dstFile);
//		System.out.println("========Test END=====");
//	}
//	@Test
//	public void verifyLogoInHomePage() {
//		System.out.println("==========Test START=======");
//		System.out.println("capture the logo status");
//		boolean actStstus=driver.findElements(By.xpath("//img[@title='vtiger-crm-logo.gif']")).click();
//	    Assert.assertTrue(actStstus);
//		System.out.println("======Test END======");
//	}
//		
//	}
