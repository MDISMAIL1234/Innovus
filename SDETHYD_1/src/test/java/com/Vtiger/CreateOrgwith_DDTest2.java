
package com.Vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.generic.Baseclass;
import com.vtiger.generic.FileUtility;
import com.vtiger.generic.JavaUtility;
import com.vtiger.generic.WebDriverUtility;

import objectRepo.HomePage;

public class CreateOrgwith_DDTest2 extends Baseclass{	
	//WebDriver driver;

	@Test(groups = "Regression")
	public void createcontact() throws InterruptedException, IOException{
		//step 1 Launch App
		
		
		hp = new HomePage(driver);
		hp.getContactslink().click();
		
		JavaUtility jv = new JavaUtility();
		int randomnumber=jv.generateRandomNo();
		
		FileInputStream fis =new FileInputStream("./config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String propvalue=prop.getProperty("url");
		System.out.println(propvalue);
		//FileUtility fileutility=new FileUtility();
		
		//FileInputStream fs =new FileInputStream("../SDETHYD_1/src/test/resources/inputData.xlsx");
		//Workbook wb= WorkbookFactory.create (fs);
		
		
	//String abc1 = wb.getSheet("Sheet2").getRow(0).getCell(1).toString();
		//WebElement First = driver.findElement(By.name("salutationtype"));
		//Select Firstdd= new Select(First);
		//Firstdd.selectByValue(abc1);
	//String abc4 = wb.getSheet("Sheet2").getRow(1).getCell(1).toString();
	//String abc5= wb.getSheet("Sheet2").getRow(1).getCell(2).toString();
	//driver.findElement(By.name("lastname")).sendKeys(abc4);
			
		
		//Step 1 launch app
		//if 
		//prop.getProperty("browser").equalsIgnoreCase("Firefox"))
			//(FileUtility.readDatafromPropfiles("browser").equalsIgnoreCase("Firefox"))
	
			
			//{
			//driver = new FirefoxDriver();
			//}
		//else if 
		//prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			
			//(FileUtility.readDatafromPropfiles("browser").equalsIgnoreCase("Chrome"))
			//{
			//driver = new ChromeDriver();
			//}
		//else if 
		//prop.getProperty("browser").equalsIgnoreCase("safari"))
			//(FileUtility.readDatafromPropfiles("browser").equalsIgnoreCase("safari"))
			//{
			//driver = new SafariDriver();
			//}
		//else
		//{
			//driver=new FirefoxDriver();
		//}
		//driver.get(prop.getProperty("URL"));
		//driver.get(FileUtility.readDatafromPropfiles("URL"));
		//driver.manage().window().maximize();
		
		//Step 2 Login to app
		//driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.name("user_name")).sendKeys(FileUtility.readDatafromPropfiles("username"));
		//driver.findElement(By.name("user_password")).sendKeys(FileUtility.readDatafromPropfiles("password"));
		
		
		//driver.findElement(By.id("submitButton")).click();
		//driver.findElement(By.name("accountname")).sendKeys("Ismail");
		//WebElement industryDropdown=driver.findElement(By.name("industry"));
		//Select industryDD = new Select(industryDropdown);
		//industryDD.selectByVisibleText("Education");
		//WebDriverUtility webutility = new WebDriverUtility();
		//webutility.selectelementfromDropdown(industryDropdown,"Education");
		
		//WebElement ratingDropdown=driver.findElement(By.name("rating"));
		//Select ratingDD = new Select(ratingDropdown);
		//ratingDD.selectByValue("Active");
		//webutility.selectelementfromDropdown(ratingDropdown,"Active");
		
		//WebElement typeDropdown = driver.findElement(By.name("accounttype"));
		//Select typeDD=new Select(typeDropdown);
		//typeDD.selectByIndex(3);
		//webutility.selectelementfromDropdown(typeDropdown ,3);
		
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		//WebElement searchfldDropdown =driver.findElement(By.name("search_field"));
		//Select searchfldyDD = new Select(searchfldDropdown);
		//searchfldyDD.selectByVisibleText("Organization Name");
		
		//driver.findElement(By.name("submit")).click();
		
		//Assert.assertEquals(actulelement.isDisplayed(),true);
		//logout from app
		
		Random random = new Random();
		int randomnumber1 = random.nextInt(1000);
		System.out.println(randomnumber1);
		String orgname="Ismail"+randomnumber1;
		System.out.println(orgname);
		

//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step 2 Login to app
		//driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.id("submitButton")).click();
		//step 3 click on + btn
		  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			
	     	//ste 4 click on +btn
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
					//step 5
			WebElement intialsDD=driver.findElement(By.name("salutationtype"));

		


		Select intialsDropdown=new Select(intialsDD);
		intialsDropdown.selectByVisibleText("Mr.");
		driver.findElement(By.name("firstname")).sendKeys(orgname);
		driver.findElement(By.name("lastname")).sendKeys("HYD");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Check contact is created or not
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("Ismail");
		
		WebElement searchfldDropdown1=driver.findElement(By.name("search_field"));
		Select searchfldYDD=new Select(searchfldDropdown1);
		searchfldYDD.selectByVisibleText("First Name");
		driver.findElement(By.name("submit")).click();
		//validate with Assert
		WebElement actulelement=driver.findElement(By.xpath("//a[@title='Contacts']"));
		System.out.println(actulelement.isDisplayed());
		Assert.assertEquals(actulelement.isDisplayed(),true);
		driver.navigate().refresh();
		//Logout from APP
		Actions action =new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"))).click();
		//webutility.movetoelement(driver,driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")));
		
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.findElement(By.name("submit")).click();
		//close the browser
		Thread.sleep(5000);
		
		
		
			
		
		
		
		
		
		
				
														 					
	}

	

		
	}

	
		
		
	

	

		
	
	


