package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class CommonJson {

	public static void main(String[] args)throws IOException ,ParseException, org.json.simple.parser.ParseException 
	{
		FileReader inputfile=new FileReader("");
		JSONParser parser = new JSONParser();
		Object obj=parser.parse(inputfile);
		HashMap jobj = (HashMap) obj;
		String value=jobj.get("browser").toString();
		System.out.println(value);
		

	}

}
