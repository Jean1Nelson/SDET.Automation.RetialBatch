package Testing;

import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider(parallel = true)
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "user1" }, new Object[] { 2, "user2" },
				new Object[] { 3, "user3" }, };
	}

	@Test(dataProvider = "dp")
	public void testDataProvider1(Integer n, String str) {
		System.out.println(n + "  --  " + str);
	}

	
	@Test(dataProvider = "dp1",dataProviderClass = DataProviderClass.class)
	public void testDataProviderClass1(Integer n, String str) {
		System.out.println(n + "  --  " + str);
	}
	
	
}
