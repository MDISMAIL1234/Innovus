package com.Vtiger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest_dataProvider {
	@Test(dataProvider = "bookTicketDataProvider")	
public void bookTicket(String src ,String dest,int ticket)	{
		System.out.println("execute source =>"+src+",Destination==>"+dest);	
	}
@DataProvider
public Object[][] bookTicketDataProvider() {
	Object[][] objArr = new Object[5][3];
	objArr[0][0] = "Hyderabad";
	objArr[0][1] = "Rangareddy";
	objArr[0][2] = 10;
	
	objArr[1][0] = "Bombay";
	objArr[1][1] = "pune";
	objArr[1][2] = 10;
	
	objArr[2][0] = "Madras";
	objArr[2][1] = "chennai";
	objArr[2][2] = 10;
	
	objArr[3][0] = "Bangalore";
	objArr[3][1] = "Kerala";
	objArr[3][2] = 10;
	
	objArr[4][0] = "Haryana";
	objArr[4][1] = "Uttarpradesh";
	objArr[4][2] = 10;
	return objArr;
	
}

}
