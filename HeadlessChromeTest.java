package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessChromeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("window-size-1400,800");
		chromeOptions.addArguments("headless");
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.get("https://www.irctc.co.in/nget/profile/user-registration");
		System.out.println(webDriver.getTitle());
		

	}

}
