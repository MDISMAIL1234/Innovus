package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Non_SeclectDD {



	//private static int i;

	public static void main(String[] args, int i) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//img[@src='dropdown']")).click();
		
		List<WebElement>list = driver.findElements(By.xpath("//select[@name='search_field']"));
		
		for (int i1= 0;i1<list.size(); i1++)
		{
			String str=list.get(i1).getText();
			if(str.equalsIgnoreCase("Organizations"));
		}
		
		list.get(i).click();
	
		
	}
	

}

