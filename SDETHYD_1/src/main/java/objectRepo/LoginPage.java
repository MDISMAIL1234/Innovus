package objectRepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.generic.FileUtility;

public class LoginPage //Rule 1 Page should be class name
{

	WebDriver driver;
	FileUtility fileutility=new FileUtility();


	public LoginPage(WebDriver driver)
	{
		this.driver=driver;                                             //Rule 2 Use @findby annotation to locate
		PageFactory.initElements(driver,this);                          //Rule 3 declare webelements as pvt
	}
	@FindBy(name="user_name")
	private WebElement usernametxtfld;

	@FindBy(name="user_password")
	private WebElement passwordtxtfld;

	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void logintoApp() throws IOException                      //rule 6 Use Business libraries
	{
		usernametxtfld.sendKeys(fileutility.readDatafromPropfiles("username"));
		passwordtxtfld.sendKeys(fileutility.readDatafromPropfiles("password"));
		loginbtn.click();
	}
	public void logintoApp(String username,String password)
	{
		usernametxtfld.sendKeys(username);
		passwordtxtfld.sendKeys(password);
		loginbtn.click();
	}
}

