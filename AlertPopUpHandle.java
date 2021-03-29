package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		webDriver.findElement(By.name("proceed")).click();
		Alert alert = webDriver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
