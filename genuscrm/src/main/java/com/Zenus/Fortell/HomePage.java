package com.Zenus.Fortell;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;


public class HomePage {
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement AccountsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	
	}
	public void clickContactsTab()
	{
		AccountsTab.click();
		
	}
}
