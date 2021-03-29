package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.irctc.co.in/nget/train-search");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.get("https://www.freecrm.com/");
		List<WebElement> findElements = webDriver.findElements(By.tagName("a"));
		findElements.addAll(webDriver.findElements(By.tagName("img")));
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i = 0;i<findElements.size();i++) {
			
			if(findElements.get(i).getAttribute("href")!=null && (!findElements.get(i).getAttribute("href").contains("javascript"))) {
				
				activeLinks.add(findElements.get(i));
			}
		}
		System.out.println(findElements.size());
		System.out.println(activeLinks.size());
		
		for(WebElement activeLink:activeLinks) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLink.getAttribute("href")).openConnection();
			connection.connect();
			String responseMessage = connection.getResponseMessage();
			connection.disconnect();
			System.out.println("Active links "+activeLink.getAttribute("href")+" "+responseMessage);
		}
	}
	

}


//Output
//Active links https://freecrm.com/ OK
//Active links https://freecrm.com/ OK
//Active links https://freecrm.com/about.html OK
//Active links https://freecrm.com/# OK
//Active links https://freecrm.com/crmcloud.html OK
//Active links https://freecrm.com/hipaa.html OK
//Active links https://freecrm.com/dental.html OK
//Active links https://freecrm.com/auto.html OK
//Active links https://freecrm.com/callcenter.html OK
//Active links https://freecrm.com/insurance.html OK
//Active links https://freecrm.com/re.html OK
//Active links https://freecrm.com/ps.html OK
//Active links https://freecrm.com/cb.html OK
//Active links https://freecrm.com/is.html OK
//Exception in thread "main" java.net.MalformedURLException: no protocol: 
//	at java.base/java.net.URL.<init>(URL.java:645)
//	at java.base/java.net.URL.<init>(URL.java:541)
//	at java.base/java.net.URL.<init>(URL.java:488)
//	at SeleniumSessions.BrokenLinkTest.main(BrokenLinkTest.java:43)


