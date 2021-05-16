package Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTag {

	@Test
	@Parameters({"user", "pswd"})
	public void test1(String usr, String psw)
	{
		System.out.println(usr);
		System.out.println(psw);
	}
	
	
}
