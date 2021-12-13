package com.Vtiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocations {
	@Test(invocationCount=5)
	public void CreateOrg() {
		
		Reporter.log("printing");
	}
	}


