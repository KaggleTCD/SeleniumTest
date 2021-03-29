package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
	WebDriver webDriver = new ChromeDriver();
	//webDriver.manage().window().maximize();
	webDriver.manage().deleteAllCookies();
	webDriver.get("http://jqueryui.com/droppable/");
	webDriver.switchTo().frame(0);
	Actions action = new Actions(webDriver);
	action.clickAndHold(webDriver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(webDriver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
	}
}
