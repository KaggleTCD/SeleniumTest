package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.facebook.com");
		//webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement findElement = webDriver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		flash(findElement,webDriver);
		
	}
	
	public static void flash(WebElement webElement,WebDriver webDriver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)webDriver);
		String bgColor = webElement.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {

		 changeColor("rgb(0,200,0)",webElement,webDriver);
		 changeColor(bgColor,webElement,webDriver);
		}
		
	}
	public static void changeColor(String color,WebElement webElement,WebDriver webDriver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)webDriver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", webElement);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
