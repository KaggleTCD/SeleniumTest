package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://html.com/input-type-file/");
		webDriver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\phipartners\\Downloads\\Lord Vishnu.png");
	}

}
