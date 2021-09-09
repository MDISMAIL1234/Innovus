package com.Zenus.Fortell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;

public class CreateAccountsPage {
	private static final CharSequence Phone = null;
	private static final CharSequence AccountName = null;
	@FindBy(xpath = "//input[@name=\"property(Account Name)\"]") private WebElement AccountNameTb;
	@FindBy(xpath = "//input[@name=\"property(Phone)\"]") private WebElement PhoneTb;
	@FindBy(xpath = "(//input[@value=\"Save\"])[1]") private WebElement saveBtn;
	
	public CreateAccountsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void CreateContactwithMandatory(String FirstName, String ln)
	{
		AccountNameTb.sendKeys(AccountName);
		PhoneTb.sendKeys(Phone);
		saveBtn.click();
		
	
	
	
}

}
