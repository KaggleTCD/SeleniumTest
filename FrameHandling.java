package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		webDriver.get("https://ui.freecrm.com/");
		webDriver.findElement(By.name("name")).clear();
		webDriver.findElement(By.name("email")).sendKeys("lihobem796@j24blog.com");
		webDriver.findElement(By.name("password")).clear();
		webDriver.findElement(By.name("password")).sendKeys("Abc@2020");
		webDriver.findElement(By.className("ui fluid large blue submit button")).click();
		
	}

}
