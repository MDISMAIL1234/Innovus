package com.Vtiger;


import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generic.Baseclass;
import com.vtiger.generic.FileUtility;
import com.vtiger.generic.WebDriverUtility;

import objectRepo.HomePage;


public class TC_0001_CreateOrgWith_DDTest extends Baseclass 

{
	@Test(groups = "smoke")
	public void TC_0001_createOrgwithDD() throws InterruptedException, IOException 
	{
		//Step 2 Login to app
		WebDriverUtility Webutility=new WebDriverUtility();

		//step 3 click on org link
		hp = new HomePage(driver);
		hp.getOrglink().click();


		//step 4 click on +btn
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Random random = new Random();
		int randomnumber = random.nextInt(1000);
		System.out.println(randomnumber);
		String orgname="testyantra"+randomnumber;
         driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		//Assert.assertEquals(actulelement.isDisplayed(),true);

		//logout from app

		Webutility.movetoelement(driver,driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")));
		Reporter.log("true");

	}

}


