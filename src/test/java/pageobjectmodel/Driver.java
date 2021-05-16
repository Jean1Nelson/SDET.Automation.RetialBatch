package pageobjectmodel;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {

	WebDriver driver;
	LoginPage objLogin;
	HomePage objHome;
	GradePage objGrade;
	DirectoryPage objDirectory;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 0, enabled = false)
	public void testGradePage() {
		objLogin = new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();

		objHome = new HomePage(driver);
		objHome.moveToAdminJobGrades();

		objGrade = new GradePage(driver);
		System.out.println("Column Count:" + objGrade.getGradeTableColCnt());
		System.out.println("Row Count:" + objGrade.getGradeTableRowCnt());

	}

	@Test(priority = 1)
	public void testDirectoryPage() {
		objLogin = new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();

		objHome = new HomePage(driver);
		objHome.clickOnDirectoryTab();

		objDirectory = new DirectoryPage(driver);

		objDirectory.setSearchByName("Peter");
		objDirectory.clickOnSearchBtn();
		int r = objDirectory.getRowCnt();
		System.out.println(r);
		List<HashMap<String, String>> al = objDirectory.readDirectoryTableData(r);
		traverseListOfHashMap(al);

		objDirectory.clickOnResetBtn();

		objDirectory.selectSearchByJobTitle("IT Manager");
		objDirectory.clickOnSearchBtn();
		r = objDirectory.getRowCnt();
		System.out.println(r);
		al = objDirectory.readDirectoryTableData(r);
		traverseListOfHashMap(al);

		objDirectory.clickOnResetBtn();

	}

	@AfterTest
	public void tear() {
		driver.close();
	}

	public void traverseListOfHashMap(List<HashMap<String, String>> lst) {
		for (HashMap<String, String> hashMap : lst) {

			System.out.println(hashMap);

		}
	}

}
