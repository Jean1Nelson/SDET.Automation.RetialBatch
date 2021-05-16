package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title:"+driver.getTitle());
		System.out.println("Current Url:" +driver.getCurrentUrl());
	
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}

