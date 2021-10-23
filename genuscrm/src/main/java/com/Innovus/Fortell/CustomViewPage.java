package com.Innovus.Fortell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;

public class CustomViewPage {
	ErrorPage ep = new ErrorPage();
	@FindBy(xpath = "//input[@value=\"New Contact\"]") private WebElement newContactsBtn;
	
	
	public CustomViewPage()
		{
		
		PageFactory.initElements(BaseTest.driver, ep);
		
		}
	public void clickNewContactBtn()
	{
		newContactsBtn.click();
	}
	

	
	
}
