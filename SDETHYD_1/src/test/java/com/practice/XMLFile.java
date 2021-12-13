package com.practice;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLFile {

	public static void main(String[] args) throws DocumentException
	{
		File inputfile = new File("/SDETHYD_1/data.xml");
		
		SAXReader reader =new SAXReader();
		Document doc = reader.read(inputfile);
		String value =doc.selectSingleNode("//Empoyeedetails/org").getText();
		System.out.println(value);
		
		

	}

}
