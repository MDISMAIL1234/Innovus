package com.Innovus.Fortell;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;



public class CreateContactPage {

	@FindBy(xpath = "//input[@name=\"property(First Name)\"]") private WebElement FirstNameTb;
	@FindBy(xpath = "//input[@name=\"property(Last Name)\"]") private WebElement lastNameTb;
	@FindBy(xpath = "(//input[@value=\"Save\"])[1]") private WebElement saveBtn;
	
	public CreateContactPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void CreateContactwithMandatory(String FirstName, String ln)
	{
		FirstNameTb.sendKeys(FirstName);
		lastNameTb.sendKeys(ln);
		saveBtn.click();
		
	}
	
	
}
