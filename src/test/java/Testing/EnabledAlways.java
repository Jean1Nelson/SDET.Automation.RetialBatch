package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledAlways {

	
	@Test(enabled = false)
	public void test1() {
		System.out.println("test1 .......");
	}
	
	
	@Test(dependsOnMethods = {"test2"}, alwaysRun = true)
	public void test3() {
		System.out.println("test3 .......");
	}
	
	@Test
	public void test2() {
		System.out.println("test3 .......");
		Assert.assertEquals(true, false);
	}
	
	
	
}
