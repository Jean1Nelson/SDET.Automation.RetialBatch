package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		// Log out
		driver.findElement(By.partialLinkText("Welcome")).click();
		//driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
		//<a href="/index.php/auth/logout">Logout</a>
		
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();

		driver.findElement(By.linkText("logout")).click();

		driver.close();

	}	
}
