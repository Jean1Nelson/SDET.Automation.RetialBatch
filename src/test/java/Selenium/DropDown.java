package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/dropdown");

		WebElement we = driver.findElement(By.xpath("//*[@id='Index']"));

		Select sel = new Select(we);

		System.out.println(sel.isMultiple());

		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("2");
		Thread.sleep(3000);
		sel.selectByVisibleText("Orange");

	}

}
