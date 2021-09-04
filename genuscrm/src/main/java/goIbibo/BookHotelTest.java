package goIbibo;

import com.Innovus.GenericLib.BaseTest;
import com.Innovus.GenericLib.FileLib;


public class BookHotelTest extends BaseTest {
	
	public static void main(String[] args) throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//FileLib flib = new FileLib();
		
		IndiaPage Ip = new IndiaPage();
		Ip.bookHotel("hyderabad");
		
			
	}

}
