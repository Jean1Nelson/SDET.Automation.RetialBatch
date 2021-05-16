package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
	
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
			
		 driver.findElement(By.id("txtUsername"));
		
		 driver.findElement(By.className(""));
		 driver.findElement(By.cssSelector(""));
		 driver.findElement(By.xpath(""));
		 driver.findElement(By.name(""));
		 
		 driver.findElement(By.partialLinkText(""));
		 driver.findElement(By.tagName(""));


	
	}

}
