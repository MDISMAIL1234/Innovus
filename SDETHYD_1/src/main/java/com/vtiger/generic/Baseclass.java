package com.vtiger.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class Baseclass {


	public	WebDriver driver;
	public 	FileUtility fileutility = new FileUtility();
	public HomePage hp;
	
	@BeforeSuite(groups={"smoke","Regression"})
	
	public void startConnection()
	{
		System.out.println(" Start the Connection with DataBase");
	}

	//@Parameters("browser")
	@BeforeClass(groups={"smoke","Regression"})
	public void launchBrowser() throws Throwable
	{
		String browsername=fileutility.readDatafromPropfiles("browser");
		if (browsername.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}		

		driver.get(fileutility.readDatafromPropfiles("url"));
		driver.manage().window().maximize();	
	}
	@BeforeMethod(groups={"smoke","Regression"})

	public  void login() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.logintoApp();
	}
	@AfterClass(groups={"smoke","Regression"}
	)
	public void closebrowser()

	{
		driver.close();
	}
	@AfterSuite(groups= {"smoke","Regression"})
	public void closeConnection()
	{
		System.out.println("Close the Connection DataBase");
	}


	@AfterMethod(groups={"smoke","Regression"})
	public void logout()
	{
		hp = new HomePage(driver);
		hp.logoutfromApp();
	}


}


