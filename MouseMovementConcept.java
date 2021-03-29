package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.airindia.in/");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		Actions action = new Actions(webDriver);
		action.moveToElement(webDriver.findElement(By.linkText("Manage Your Trip"))).build().perform();
		Thread.sleep(3000);
		webDriver.findElement(By.linkText("Manage Booking")).click();
		
	}

}
