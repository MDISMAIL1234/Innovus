package com.Innovus.Fortell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;

public class LoginPage {
	
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement Pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]") private WebElement signInBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getUntb() {
		return untb;
	}
     public void setUntb(WebElement untb) {
    	 this.untb = untb;
    }
     public WebElement getPwtb() {
    	 return Pwtb;
     }
     public void setPwtb(WebElement Pwtb) {
    	 this.Pwtb = Pwtb;
     }
     public WebElement getSignInBtn() {
   
    	 return signInBtn;
     }
     public void loginToApp(String un, String Pwd)
     {
    	 untb.sendKeys(un);
    	 Pwtb.sendKeys(Pwd);
    	 signInBtn.click();
     }
}
