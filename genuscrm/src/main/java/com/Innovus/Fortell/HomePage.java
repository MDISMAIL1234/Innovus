package com.Innovus.Fortell;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;


public class HomePage {
	@FindBy(xpath = "//a[text()='Contacts']") private WebElement ContactsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	
	}
	public void clickContactsTab()
	{
		ContactsTab.click();
		
	}
}
