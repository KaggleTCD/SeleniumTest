package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		//Testing is happening behind the scenes.No browser launching
		//It is very fast
		//Not suitable for action class like mouse movement or double click or drag and drop.
		//Ghost driver or headless browser
		WebDriver webDriver = new HtmlUnitDriver();
		webDriver.get("http://www.facebook.com");
		//webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//html unit driver is not present in Selenium 3.x version
		//download the jar file separately
		String title = webDriver.getTitle();
		System.out.println(title);
	}

}
