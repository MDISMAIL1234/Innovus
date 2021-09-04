package contactsPage;

import org.openqa.selenium.By;

import com.Innovus.GenericLib.BaseTest;
import com.Innovus.GenericLib.FileLib;

public class validLoginTest extends BaseTest {
	
	public static void main(String[] args) throws Throwable{
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		FileLib flib=new FileLib();
		String un=flib.readpropertyData(PROP_PATH,"username");
		String pwd=flib.readpropertyData(PROP_PATH,"password");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
	}

}
