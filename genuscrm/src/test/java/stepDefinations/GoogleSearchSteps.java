package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	
WebDriver driver;

@Given("Browser is opened")
public void browser_is_opened() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\git\\repository\\genuscrm\\src\\main\\resources\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
}

@And("User is Google Page")
public void user_is_google_page() {
    driver.get("https://www.google.co.in/");
    
}

@When("^User enters(.*) in serchfield$")
public void user_enters_text_in_serchfield(String name) {
	driver.findElement(By.name("q")).sendKeys(name);   
}

@And("User clicks On SearchButton")
public void user_clicks_on_search_button() {
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  
}

@Then("Search Results Page should be dispalyed")
public void search_results_page_should_be_dispalyed() throws InterruptedException {
	Thread.sleep(4000);
	if(driver.getTitle().equals("qspiders - Google Search"))
	{
//		Assert.assertTrue(true);
		System.out.println("Successfully Navigated to search results page,PASS");
	}
	else
	{
		System.out.println("Failed to Navigate to search results page, FAIL");
//		Assert.assertTrue(false);
	}
}
}



