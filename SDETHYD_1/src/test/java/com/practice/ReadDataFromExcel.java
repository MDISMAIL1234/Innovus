package com.practice;

import java.io.FileInputStream;

import org.apache.poi.poifs.property.Property;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void Excel() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue = wb.getSheet("Sheet2").getRow(0).getCell(0).toString();
		System.out.println(excelvalue);
	}
	public static void Properties() throws Throwable {
	FileInputStream fis =new FileInputStream("/SDETHYD_1/Commondata.properties");
	java.util.Properties pro = new java.util.Properties();
	
	pro.load(fis);
	String propvalue = pro.getProperty("name","incorrect Key");
	System.out.println(propvalue);

}
public static void main(String args[]) throws Throwable
{
	ReadDataFromExcel.Excel();
	ReadDataFromExcel.Properties();
}
}
