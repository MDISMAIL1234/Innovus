package com.Vtiger;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import objectRepo.HomePage;

public class ExtentReport1 {
	
WebDriver driver;

@Test
public void CreateContact() throws InterruptedException 
{
     ExtentHtmlReporter reporter = new ExtentHtmlReporter("./IsmailPractice/src/test/resources/reports.html");
     
     reporter.config().setDocumentTitle("IsmailPractice");
     reporter.config().setReportName("Vtiger");
     reporter.config().setTheme(Theme.DARK);
     
     ExtentReports reports = new ExtentReports();
     reports.attachReporter(reporter);
     
     reports.setSystemInfo("AppURL",  "http://localhost:8888/index.php?module=Accounts&action=index");
     reports.setSystemInfo("Env",  "Test QA");
     reports.setSystemInfo("Build ", "2.1");
     reports.setSystemInfo("Reporter name ", "Ismail");
     
     ExtentTest test=reports.createTest("createcontact");
     test.log(Status.PASS,"this TC is pass");
     
        WebDriver driver = new FirefoxDriver();
   		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		
   		
           Random random = new Random();
   			int randomnumber = random.nextInt(1000);
   			System.out.println(randomnumber);
   			String orgname="testyantra"+randomnumber;

   			System.out.println(orgname);
   			
   			driver.findElement(By.name("user_name")).sendKeys("admin");
   			driver.findElement(By.name("user_password")).sendKeys("12345");
   			driver.findElement(By.id("submitButton")).click();
   			//Thread.sleep(1000);
   			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
   			//step 4 click on +ban
   			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
   			//step 5 Fill the details and select value from DD
   			driver.findElement(By.name("accountname")).sendKeys(orgname);
   			WebElement industryDropdown=driver.findElement(By.name("industry"));
   			Select industryDD=new Select(industryDropdown);
   			industryDD.selectByVisibleText("Education");
   			WebElement typedropdown=driver.findElement(By.name("accounttype"));

   			Select typeDD=new Select(typedropdown);
   			typeDD.selectByIndex(3);
   			WebElement ratingDropdown=driver.findElement(By.name("rating"));
   			Select ratingDD=new Select(ratingDropdown);
   			//Click on org link
   			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
   			//
   			driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("Testyantra");
   			WebElement searchfldDropdown=driver.findElement(By.name("search_field"));
   			Select searchfldyDD=new Select(searchfldDropdown);
   			searchfldyDD.selectByVisibleText("Organization Name");
   			driver.findElement(By.name("submit")).click();
   			
   			
   			reports.flush();
}    
}
		

