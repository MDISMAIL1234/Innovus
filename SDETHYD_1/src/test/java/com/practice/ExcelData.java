package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {



	public static void main(String[] args)throws EncryptedDocumentException,IOException {
		FileInputStream fis = new FileInputStream("/SDETHYD_1/src/test/resources/inputData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String Excelvalue = wb.getSheet("Contacts").getRow(1).getCell(1).toString();
		
		
		System.out.println(Excelvalue);
		
		
		
		

	}

}
