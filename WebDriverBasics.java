package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.google.com");
		String title = webDriver.getTitle();
		System.out.println(title);
		System.out.println(webDriver.getPageSource());
		webDriver.quit();
	}

}
