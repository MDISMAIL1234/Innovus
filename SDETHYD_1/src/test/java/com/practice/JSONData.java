package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONData {
	public static void main(String[] args) throws IOException, ParseException
	{
		FileReader inputfile = new FileReader("/SDETHYD_1/src/test/java/com/practice/JSONData.java");
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);
	}

}
