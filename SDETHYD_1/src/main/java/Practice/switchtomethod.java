package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchtomethod {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>window=windows.iterator();
		while(window.hasNext()) {//has next() is to read weather data is present or not
			String childWindow1=window.next();
			String currenttitle=driver.switchTo().window(childWindow1).getTitle();
			if(currenttitle.equalsIgnoreCase("Fujitsu")) {
				driver.switchTo().window(childWindow1).close();
			}
		}
		

	}

}
