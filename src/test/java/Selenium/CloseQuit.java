package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.open('https://www.facebook.com')");

			Thread.sleep(5000);
		
		driver.close();
		
	}

}
