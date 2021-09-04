package goIbibo;

import org.openqa.selenium.Keys;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innovus.GenericLib.BaseTest;

public class IndiaPage {
	
	@FindBy(xpath="//input[@type=\"radio\"]") private WebElement IndiaradioBtn;
	@FindBy(xpath="//input[@id=\"downshift-1-input\"]") private WebElement WhereTb;
	@FindBy(xpath="//div[@data-testid=\"openCheckinCalendar\"]") private WebElement CheckInBtn;
	@FindBy(xpath="//span[@data-testid=\"date_li_10_8_2021\"]") private WebElement CheckInDateBtn;
	@FindBy(xpath="//div[@data-testid=\"openCheckoutCalendar\"]") private WebElement CheckOutBtn;
	@FindBy(xpath="//span[@data-testid=\"date_6_8_2021\"]") private WebElement CheckoutDateBtn;
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement GuestBtn;
	@FindBy(xpath="(//span[@class=\"class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[2]") private WebElement RoomsAddBtn;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[4]") private WebElement AdultsAddBtn;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[6]") private WebElement ChildAddBtn;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[7]") private WebElement Child1AgeAddBtn;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[8]") private WebElement Child2AgeAddBtn;
	@FindBy(xpath="//button[@class=\"dwebCommonstyles__ButtonBase-sc-112ty3f-10 PaxWidgetstyles__ButtonWrapper-sc-gv3w6r-11 KETBj dIHxWr\"]") private WebElement DoneBtn;
	@FindBy(xpath="//button[@data-testid=\"searchHotelBtn\"]") private WebElement SearchBtn;
	public IndiaPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void bookHotel(String place) throws InterruptedException
	{
		IndiaradioBtn.click();
		WhereTb.sendKeys(place);
		Thread.sleep(2000);
		WhereTb.sendKeys(Keys.DOWN);
		WhereTb.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//BaseTest.driver.manage().timeouts();
		CheckInBtn.click();
		CheckInDateBtn.click();
		CheckOutBtn.click();
		CheckoutDateBtn.click();
		GuestBtn.click();
		RoomsAddBtn.click();
	    AdultsAddBtn.click();
		ChildAddBtn.click();
		Child1AgeAddBtn.click();
		Child2AgeAddBtn.click();
		DoneBtn.click();
		SearchBtn.click();
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	
			
		


