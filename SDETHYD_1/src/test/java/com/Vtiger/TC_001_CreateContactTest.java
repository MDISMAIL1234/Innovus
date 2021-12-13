
package com.Vtiger;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.generic.Baseclass;
import com.vtiger.generic.ExcelUtility;

import objectRepo.ContactInfopage;
import objectRepo.CreateNewContactPage;
import objectRepo.CreateNewOrgPage;
import objectRepo.HomePage;

public class TC_001_CreateContactTest extends Baseclass {
	
	
	@Test
	public void  Tc_001_CreateContactDD() throws InterruptedException, IOException  {
	hp = new HomePage(driver);
	hp.getContactslink().click();
	//ExcelUtility Elib= new ExcelUtility();	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

public static void Main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
        Random random = new Random();
		int randomnumber = random.nextInt(1000);
		System.out.println(randomnumber);
		String orgname="Ismail"+randomnumber;
		System.out.println(orgname);
		
		
		ExcelUtility Elib= new ExcelUtility();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ContactInfopage cip= new ContactInfopage(driver);
		cip.createcont();  


       // WebDriver driver = new FirefoxDriver();
		//driver.get("http://localhost:8888/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.name("user_name")).sendKeys("admin");
		//driver.findElement(By.name("user_password")).sendKeys("12345");
		//driver.findElement(By.id("submitButton")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		//ste 4 click on +btn
		//driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//step 5
		//WebElement intialsDD=driver.findElement(By.name("salutationtype"));
		//Select intialsDropdown=new Select(intialsDD);
		//intialsDropdown.selectByVisibleText("Mr.");
		//driver.findElement(By.name("firstname")).sendKeys(orgname);
		//driver.findElement(By.name("lastname")).sendKeys("HYD");
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//Thread.sleep(1500);
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		String abc1 = Elib.readDatafromExcel(2, 3, "Sheet1");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown1(abc1);

		String abc2=Elib.readDatafromExcel(0, 1, "Sheet1");
		  cnp.firstname().sendKeys(abc2);
		String abc4 = Elib.readDatafromExcel(2, 3, "Sheet1");
		  cnp.lastname().sendKeys(abc4);

		  cnp.getSavecontbtn().click();

		//Again clicking on Contacts
		   hp.getContactslink().click();		
		//sending data in text boz
		cip.contactname().sendKeys(abc4);

		String abc3 = Elib.readDatafromExcel(2, 4, "Sheet1");
		cip.selectdropdown(abc3);
		 Assert.assertFalse(true);
			cip.submit();








		List<WebElement> orgname1= driver.findElements(By.xpath("//table/tbody/tr/td[4]"));


		for(int i=0; i<orgname1.size();i++)
		{
			driver.findElement(By.xpath(""));
			System.out.print(orgname1.get(i).getText());
		}



	}

}
