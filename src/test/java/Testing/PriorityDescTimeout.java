package Testing;

import org.testng.annotations.Test;

public class PriorityDescTimeout {

	@Test(priority = 1, description = "Test 1 Desc")
	public void ctest() {
		System.out.println("Test 1 executed...........");
	}

	@Test(priority = 0, description = "Test 2 Desc")
	public void btest() {
		System.out.println("Test 2 executed...........");
	}

	@Test(priority = 2, description = "Test 3 desc")
	public void atest() {
		System.out.println("Test 3 executed...........");
	}

	@Test(priority = 3, description = "Timeout Testing1", timeOut = 300)
	public void test4() {
		System.out.println("Test 4 for Timeout executed...........");
		try {
			Thread.sleep(300);
		} catch (Exception e) {

		}
	}

	@Test(priority = 4, description = "Timeout Testing2", timeOut = 300)
	public void test5() {
		System.out.println("Test 5 for Timeout executed...........");
		try {
			Thread.sleep(200);
		} catch (Exception e) {

		}

	}

}
