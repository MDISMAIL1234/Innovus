package com.Vtiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depensonmethod {
	@Test
	public void createOrg(){
		Reporter.log("Completed");
		
	}
	


	@Test(dependsOnMethods="createOrg")
	public void modifyOrg(){
		Reporter.log("false");
		
	}
	
	
	@Test(dependsOnMethods ="modifyOrg")
	public void delOrg() {
		Reporter.log("true ");
	}
	}
	
