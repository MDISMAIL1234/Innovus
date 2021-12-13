package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_webtable1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("12345");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
Thread.sleep(1000);
//Click on all check boxes

//List<WebElement> chkbox=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/input"));
List<WebElement> chkbox=driver.findElements(By.xpath("//tbody//tr[*]//td[*]//input[@type='checkbox']"));
int count =0;
System.out.println(chkbox.size());
for (int i=3;i<=chkbox.size()+1;i++)
{
	//driver.findElement(By.xpath("//table[@type='checkbox']/tbody/tr["+i+"]/td[*]/input")).click();
	driver.findElements(By.xpath("//tbody//tr["+i+"]//td[*]//input[@type='checkbox']"));

	count++;
}
System.out.println(count);
}
}