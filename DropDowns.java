package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.facebook.com");
		//webDriver.findElement(By.linkText("Create New Account")).click();
		WebElement day = webDriver.findElement(By.id("day"));
		WebElement month = webDriver.findElement(By.id("month"));
		WebElement year = webDriver.findElement(By.id("year"));
		selectValueFromDropDown(day, "10");
		selectValueFromDropDown(month, "May");
		selectValueFromDropDown(year, "1990");
		
		
	}
	
	public static void selectValueFromDropDown(WebElement webElement,String value) {
		
		Select select = new Select(webElement);
		select.selectByVisibleText(value);
	}

}
