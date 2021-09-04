package com.Innovus.Fortell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;

public class ErrorPage {

		@FindBy(xpath = "//a[@href=\"/crm/ShowHomePage.do\"]") private WebElement HomepageTab;
		
		public ErrorPage()
		{
			PageFactory.initElements(BaseTest.driver, this);
		
		}
		public void clickHomeTab()
		{
			HomepageTab.click();
			
		}
}
