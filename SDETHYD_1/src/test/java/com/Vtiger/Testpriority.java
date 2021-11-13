package com.Vtiger;

import org.testng.annotations.Test;

public class Testpriority {
	@Test(priority = 2)
	public void createOrg() {
		System.out.println("Test")	;	
	}
	@Test
	public void modifyOrg() {
		
		
		System.out.println("compile");
		
		
	}
	@Test(priority = 3)
	public void deleteOrg() {
		System.out.println("validate");
		
	}

}
