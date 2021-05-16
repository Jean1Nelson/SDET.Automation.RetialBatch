package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		List<WebElement> al = driver.findElements(By.xpath("//input[starts-with(@id,'txt')]"));

		System.out.println(al.size());

		for (WebElement webElement : al) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("id"));
		}

		driver.findElement(By.id("btnLogin")).click();

		System.out.println("Title:" + driver.getTitle());

		driver.findElement(By.partialLinkText("Welcome")).click();

		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.close();

	}

}