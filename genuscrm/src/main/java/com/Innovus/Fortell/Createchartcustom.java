package com.Innovus.Fortell;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Innovus.GenericLib.BaseTest;
import com.Innovus.GenericLib.ReportListeners;
import com.Innovus.GenericLib.WebDriverCommonLib;
import com.Innovus.Pages.LoginPage;


@Listeners(com.Innovus.GenericLib.ReportListeners.class)
public class Createchartcustom extends BaseTest{
	
	@Test 
	public void runReports()
	{
		LoginPage lp=new LoginPage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		ReportListeners.extent.createTest("runReports").assignAuthour("Ismail");
		wlib.elementStatus(lp.getUntb(),1,"username TextBox");
		wlib.elementStatus(lp.getPwtb(),2,"Password textbox");
		Assert.fail();
		wlib.elementStatus(lp.getChkbox(),3,"Checkbox");
	}

}
