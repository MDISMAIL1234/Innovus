package contactsPage;




import org.testng.annotations.Test;

import com.Innovus.Fortell.CreateContactPage;
import com.Innovus.Fortell.CustomViewPage;
import com.Innovus.Fortell.ErrorPage;
import com.Innovus.Fortell.HomePage;
import com.Innovus.Fortell.LoginPage;
import com.Innovus.GenericLib.BaseTest;
import com.Innovus.GenericLib.FileLib;
import com.Innovus.GenericLib.WebDriverCommonLib;



public class CreateContactsTest  extends BaseTest{
	
	@Test
	public void createcontact() throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp=new LoginPage();
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readpropertyData(PROP_PATH,"username"), flib.readpropertyData(PROP_PATH,"password"));
		
		Thread.sleep(10000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "homeTitle"),"Home Page");
			//	ErrorPage ep = new ErrorPage();
	        //       ep.clickHomeTab();
		
		HomePage hp = new HomePage();
		
		hp.clickContactsTab();
	
		Thread.sleep(10000);
		wlib.verify(wlib.getPageTitle(),flib.readpropertyData(PROP_PATH, "customViewTitle"), "Custom View Page");
		
		CustomViewPage cv=new CustomViewPage();
		cv.clickNewContactBtn();
		
		wlib.verify(wlib.getPageTitle(),flib.readpropertyData(PROP_PATH, "createContactTitle"), "Create Contact Page");
		
		CreateContactPage cl=new CreateContactPage();
		cl.CreateContactwithMandatory(flib.readExcelData(EXCEL_PATH, "Contacts",0,1),
				flib.readExcelData(EXCEL_PATH, "Contacts",1,1));
		
		wlib.verify(wlib.getPageTitle(), flib.readpropertyData(PROP_PATH, "ContactDetailsTitle"), "Contact Details Page");
		
		
		
		
	}

}
