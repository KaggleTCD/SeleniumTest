package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.irctc.co.in/nget/train-search");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//webDriver.findElement(By.xpath("//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Java");
		webDriver.findElement(By.xpath("//input[contains(@class,'ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("Java");
		
		
		
		
	}
}
