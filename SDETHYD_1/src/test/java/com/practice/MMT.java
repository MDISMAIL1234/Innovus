package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MMT {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.moveByOffset(10,10).click().perform();
		
		driver.findElement( By.id("fromCity")).sendKeys("BOM");
		
		driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		driver.findElement(By.id("toCity")).sendKeys("GOI");
		driver.findElement(By.xpath("//div[contains(text(),'GOI')]")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(ById.xpath("//div[@aria-label='Tue Oct 05 2021']")).click();
		
	}

}
