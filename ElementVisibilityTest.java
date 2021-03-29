package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C://Gecko Driver//geckodriver.exe");
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("https://www.irctc.co.in/nget/profile/user-registration");
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//boolean isDisplayed = webDriver.findElement(By.id("u_0_b")).isDisplayed();
		//System.out.println(isDisplayed);
		//boolean isEnabled = webDriver.findElement(By.id("u_0_b")).isEnabled();
	//	System.out.println(isEnabled);
		WebElement findElement = webDriver.findElement(By.xpath("//*[contains(@id,'sbi')]"));
		boolean isSelected = findElement.isSelected();
		System.out.println(isSelected);
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("//*[contains(@id,'sbi')]")).click();
		boolean selected = webDriver.findElement(By.xpath("//*[contains(@id,'sbi')]")).isSelected();
		System.out.println(selected);
		webDriver.quit();
		

	}

}
