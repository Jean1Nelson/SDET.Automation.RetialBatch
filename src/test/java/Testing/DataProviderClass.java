package Testing;

public class DataProviderClass {

	@org.testng.annotations.DataProvider
	public static Object[][] dp1() {
		return new Object[][] { new Object[] { 4, "user4" }, new Object[] { 5, "user5" },
				new Object[] { 6, "user6" }, };
	}
	
	
}
