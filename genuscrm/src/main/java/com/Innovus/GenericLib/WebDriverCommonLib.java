package com.Innovus.GenericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.google.common.io.Files;

public class WebDriverCommonLib {
	public String getPageTitle() {
		String pageTitle = BaseTest.driver.getTitle();
		System.out.println("Actual page Title: " +pageTitle);
		return pageTitle;
	}
	public void verify(String actual, String expected, String page) {
		if(actual.equals(expected)) {
			System.out.println(page + "is Displayed PASS");
		} else {
			System.out.println(page + "is not Displayed, FAIL");
			
		}
	}
	public void selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
   public void selectOption(String text, WebElement element) {
	   Select sel = new Select(element);
	   sel.selectByVisibleText(text);
   }
   public void mouseHover(WebElement element) {
	   Actions ac = new Actions(BaseTest.driver);
	   ac.moveToElement(element).perform();   
   }
   public void rightClick(WebElement element) {
	   Actions ac = new Actions(BaseTest.driver);
	   ac.contextClick(element).perform();
   }
   public  void dragAndDropElement(WebElement source, WebElement target) {
	   Actions ac = new Actions(BaseTest.driver);
	   ac.dragAndDrop(source,target).perform();
   }
   public void switchToFrame(int index) {
	   BaseTest.driver.switchTo().frame(index);
   }
   public void switchToFrame(String value) {
	   BaseTest.driver.switchTo().frame(value);
   }
   public void switchToFrame(WebElement element) {
	   BaseTest.driver.switchTo().frame(element);
   }
   public String getFullPageScreenshot(String screenshotName) {
	   TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   String dest="C:\\Users\\user\\git\\repository\\genuscrm\\Screenshot"+screenshotName+".png";
	   File destination= new File(dest);
	   try {
		   Files.copy(src, destination);
	   }catch(IOException e) {
		   e.printStackTrace(); 
	   }
	   return dest;
   }
   public void getElementScreenshot(WebElement element, String screenshotPath) {
	   File src = element.getScreenshotAs(OutputType.FILE);
	   File dest = new File(screenshotPath);
	   try {
		   Files.copy(src, dest);
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
   }
   public void waitForPageTitle(String title) {
	   WebDriverWait wait = new WebDriverWait(BaseTest.driver,30);
	   wait.until(ExpectedConditions.titleContains(title));
   }
   
   public void elementStatus(WebElement element,int checkType, String 
			elementName)
	{
		switch(checkType)
		{
		
		
		
		case 1:
			try {
				element.isDisplayed();
				
				ReportListeners.test.pass(MarkupHelper.createLabel(elementName +"is Displayed",ExtentColor.PURPLE));
				}
			catch (Exception e) {
				
				ReportListeners.test.info(MarkupHelper.createLabel(elementName+"is not Displayed",ExtentColor.ORANGE));
			}
			break;
		case 2:
			try {
				element.isEnabled();
				ReportListeners.test.info(MarkupHelper.createLabel(elementName+" is Enabled",ExtentColor.PURPLE));
			}
			catch (Exception e) {
				ReportListeners.test.info(MarkupHelper.createLabel(elementName+"is not Enabled",ExtentColor.ORANGE)); 
				}
			break;
		case 3:
			try {
				element.isSelected();
				
				ReportListeners.test.info(MarkupHelper.createLabel(elementName +"is Selected",ExtentColor.PURPLE));
				}
			catch (Exception e) {
				ReportListeners.test.info(MarkupHelper.createLabel(elementName+"is not Selected",ExtentColor.ORANGE));
			}
			break;	
			}
		}
}	



	   

