package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_Job']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_viewPayGrades']"))).build().perform();

		act.click().perform();

	}

}
