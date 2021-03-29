package SeleniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.google.com/");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.navigate().to("http://www.amazon.in");
		Thread.sleep(5000);
		webDriver.navigate().back();
		Thread.sleep(5000);
		webDriver.navigate().forward();
		Thread.sleep(5000);
		webDriver.navigate().back();
		Thread.sleep(5000);
		webDriver.navigate().refresh();
		webDriver.quit();
		
		
	}

}
