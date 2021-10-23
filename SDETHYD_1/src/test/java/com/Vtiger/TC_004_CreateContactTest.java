package com.Vtiger;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_004_CreateContactTest {
	@Test(groups = "Regression")
	
	public void CreateContact()throws InterruptedException {
	Random random = new Random();
	int randomnumber = random.nextInt(1000);
	System.out.println(randomnumber);
	String orgname="Bagalkot"+randomnumber;

	System.out.println(orgname);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//step 2 Login to app
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("12345");
	driver.findElement(By.id("submitButton")).click();
	//step 3 click on + btn
	  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
     	//ste 4 click on +btn
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
				//step 5
		WebElement intialsDD=driver.findElement(By.name("salutationtype"));
		Select intialsDropdown=new Select(intialsDD);
		intialsDropdown.selectByVisibleText("Mr.");
		
		driver.findElement(By.name("firstname")).sendKeys(orgname);
		driver.findElement(By.name("lastname")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Check contact is created or not
				driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("Bagalkot");
				
				WebElement searchfldDropdown=driver.findElement(By.name("search_field"));
				Select searchfldYDD=new Select(searchfldDropdown);
				searchfldYDD.selectByVisibleText("First Name");
				driver.findElement(By.name("submit")).click();
				//validate with Assert
				WebElement actulelement=driver.findElement(By.xpath("//a[@title='Contacts']"));
				System.out.println(actulelement.isDisplayed());
				Assert.assertEquals(actulelement.isDisplayed(),true);
				driver.navigate().refresh();
				//Logout from APP
				Actions action =new Actions(driver);
				
				action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"))).click();
				
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	



}
}
