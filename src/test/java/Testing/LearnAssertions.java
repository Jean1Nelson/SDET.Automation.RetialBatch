package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {

	@Test
	public void testHardAssertion()
	{
		Assert.assertEquals(false, true);
		
		System.out.println("Testing Hard Assertions.....");
		
	}
	
	@Test
	public void testSoftAssertion()
	{
		
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(true, false);
		obj.assertNotEquals(true, false);
		
		System.out.println("Testing Soft Assertions.....");
		obj.assertAll();
	}
	
	
}
