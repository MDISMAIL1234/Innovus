package com.practice;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.apache.batik.w3c.dom.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class lenskart {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Actions action=new Actions(driver);
		//action.moveByOffset(10,10).click().perform();
		//driver.findElement(By.xpath("//div[@class='search_block']")).click();
		WebElement elt = driver.findElement(By.xpath("//h4[text()='INTRODUCING OJOS21 - SUBSCRIBE & SAVE']"));
		// Point loc =new elt.getlocation();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(100,2000)");
						
						
						
				
				
	}

	private static JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
