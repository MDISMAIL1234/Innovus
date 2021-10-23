package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class lenskart {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveByOffset(10,10).click().perform();
		driver.findElement(By.xpath("//div[@class='search_block']")).click();
		
	}

}
