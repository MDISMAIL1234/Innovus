package com.practice;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_webtable {

	public static void main(String[] args) {
		
		
		//Random random = new Random();
		//int randomnumber = random.nextInt(1000);
		//System.out.println(randomnumber);
		//String orgname="testyantra"+randomnumber;
		//System.out.println(orgname);

	
				WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		//Thread.sleep(1000);
		//Get all Organization name
		List<WebElement> orgname1 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[5]/td[3]/a"));
		String orgnametodelete="Testyantra667";
		
		for(int i=2; i<orgname1.size(); i++)
		{
			String sl=orgname1.get(i).getText();
			if(sl.equalsIgnoreCase(orgnametodelete))
			{
			driver.findElement(By.xpath("//table[@class='small'"+orgnametodelete+"']/tbody/tr[*]/td[1]/input")).click();
			break;
		}

	}
		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		
		driver.switchTo().alert().accept();

}
}
