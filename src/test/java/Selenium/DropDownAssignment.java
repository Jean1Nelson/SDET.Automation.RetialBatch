package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/dropdown");

		// fav fruit by index
		WebElement fruitOptions = driver.findElement(By.xpath("//*[@id='Index']"));

		Select fruit = new Select(fruitOptions);
		System.out.println(fruit.isMultiple());
		fruit.selectByIndex(2);
		
		//how's life by value
		WebElement lifeOptions = driver.findElement(By.xpath("/html/body/app-root/app-dropdown/body/div/div/div/div/div/div[2]/select"));

		Select life = new Select(lifeOptions);
		System.out.println(life.isMultiple());
		life.selectByValue("okok");

		//Thread.sleep(3000);
		
		//daily routine by visible text
		WebElement routineOptions = driver.findElement(By.id("bsdd"));

		Select routine = new Select(routineOptions);
		System.out.println(routine.isMultiple());
		routine.selectByVisibleText("Repeat");

	}

}
