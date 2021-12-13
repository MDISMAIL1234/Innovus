package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.generic.WebDriverUtility;

public class HomePage {
	
	WebDriver driver;
	WebDriverUtility Webutility=new WebDriverUtility();
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactslink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutbtn;

	
	
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getContactslink() {
		return contactslink;
	}
public void logoutfromApp() throws InterruptedException
{
	Thread.sleep(2000);
	Webutility.movetoelement(driver,logoutimg);
	Thread.sleep(2000);
	logoutbtn.click();
}
}