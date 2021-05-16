package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTags {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class ...............");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test...........");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 executed...........");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 executed...........");
	}

	@Test
	public void test3() {
		System.out.println("Test 3 executed...........");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Suite...............");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class...............");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite ..........");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method.......");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...........");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Test Suite.............");
	}

}
