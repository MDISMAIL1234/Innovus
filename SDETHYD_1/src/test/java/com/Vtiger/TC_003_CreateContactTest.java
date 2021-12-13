package com.Vtiger;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class TC_003_CreateContactTest {
	WebDriver driver;
	@Test
	public void createcontact() throws InterruptedException, IOException
	{
		//step 1 Launch App
		//FileInputStream fis =new FileInputStream("../SDETHYD_1/src/test/resources/config.properties");
		//Properties prop = new Properties();
		//prop.load(fis);
		//String propvalue=prop.getProperty("URL");
	    //System.out.println(propvalue);
		
		//FileInputStream fs =new FileInputStream("../SDETHYD_1/src/test/resources/inputData.xlsx");
		//Workbook wb= WorkbookFactory.create (fs);
		//String browsername=prop.getProperty("browser");
		//if(browsername.equals("Firefox")) {
			//driver = new FirefoxDriver();
			//System.out.println("Firefox is opened");
		//} //else if(browsername.equals("ff")) {
			
		//} //else {
			 //  System.out.println("please enter proper browser name");
	//	}
		//driver.get(prop.getProperty("url"));
		
		
	//String abc1 = wb.getSheet("Sheet2").getRow(2).getCell(3).toString();
		//WebElement First = driver.findElement(By.name("salutationtype"));
		//Select Firstdd= new Select(First);
		//Firstdd.selectByValue(abc1);
	//String abc4 = wb.getSheet("Sheet2").getRow(2).getCell(0).toString();
	//String abc5= wb.getSheet("Sheet2").getRow(1).getCell(7).toString();
	//driver.findElement(By.name("lastname")).sendKeys(abc5);
		
		//step 1 Launch App
		Random random = new Random();
		int randomnumber = random.nextInt(1000);
		System.out.println(randomnumber);
		String orgname="RangaReddy"+randomnumber;
		System.out.println(orgname);
		

		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step 2 Login to app
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		//step 3 click on contact link
	     driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				
     	//ste 4 click on +btn
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
				//step 5
		WebElement intialsDD=driver.findElement(By.name("salutationtype"));
		Select intialsDropdown=new Select(intialsDD);
		intialsDropdown.selectByVisibleText("Mr.");
		driver.findElement(By.name("firstname")).sendKeys("RangaReddy");
		driver.findElement(By.name("lastname")).sendKeys("India");
		//select the Existing org
		driver.findElement(By.xpath("(//img[@title='Select'])")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		//driver.findElement(By.xpath("//input[@title=")).click();
		String parentWindow=window.next();
		String childWindow=window.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		//driver.findElement(By.id("search_text")).sendKeys("RangaReddy");
        driver.findElement(By.name("search")).click();
		//driver.findElement(By.xpath("//a[@id='1' and text()='RangaReddy']"));
	//	driver.findElement(By.xpath("//a[@title='Contacts' and text()='"+wb.getSheet("Sheet2").getRow(1).getCell(7)+"']")).click();
        List<WebElement> names=	driver.findElements(By.xpath("(//table)[7]//tr[*]//td//a"));
        names.get(1).click();
		driver.switchTo().window(parentWindow);
		//String abc2 = wb.getSheet("Sheet2").getRow(1).getCell(4).toString();
		//WebElement Leadsource = driver.findElement(By.name("leadsource"));
	//	Select lead = new Select(Leadsource);
		//Lead.selectByValue(abc2);
		
		
		
		
		//save the contact after selecting org
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S']")).click();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//String abc3 = wb.getSheet("Sheet2").getRow(0).getCell(3).toString();
		//WebElement Indropdown = driver.findElement(By.id("bas_searchfield"));
		//Select Indd = new Select(Indropdown);
		//Indd.selectByVisibleText(abc3);
		//check contact is created or not
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("RangaReddy");
		WebElement searchfldDropdown=driver.findElement(By.name("search_field"));
	     Select searchfldDD=new Select(searchfldDropdown);
	     searchfldDD.selectByVisibleText("First Name");
	     driver.findElement(By.name("submit")).click();
	     //validate with Assert
	   
	     WebElement actulelement=driver.findElement(By.xpath("//a[@title='Contacts' and text()='RangaReddy']"));

			System.out.println(actulelement.isDisplayed());

			Assert.assertEquals(actulelement.isDisplayed(), true);

			//Logout from App
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).build().perform();

			//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.findElement(By.name("submit")).click();
			//Close the browser
			Thread.sleep(5000);
			driver.close();
		
	}

}
