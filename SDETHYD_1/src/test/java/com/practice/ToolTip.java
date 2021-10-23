package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		//step 4 click on +ban
		//driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@value='searchBtn']"));

		element.sendKeys("SDETQWE");

		//	WebElement target = driver.findElement(By.xpath("//img[@title='Search in Organization...']");

		//Actions action = new Actions(driver);
		//	action.moveToElement(target).build().perform();

		System.out.println(element.getAttribute("text"));


	}


}