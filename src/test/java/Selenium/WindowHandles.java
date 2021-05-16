package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.open('https://www.facebook.com')");
		js.executeScript("window.open('https://www.flipkart.com')");
		js.executeScript("window.open('https://www.amazon.com')");
		js.executeScript("window.open('https://www.crincinfo.com')");

		
		String parentWindow = driver.getWindowHandle(); // current driver window
		
		Set<String> wins = driver.getWindowHandles();
		
		Iterator<String>itr = wins.iterator();
		
		while (itr.hasNext()) {
			String child = itr.next();
			
			if(!parentWindow.equals(child)) {
				driver.switchTo().window(child);
				
				System.out.println("Child window to be closed:");
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
		}
		
	
	}

}
