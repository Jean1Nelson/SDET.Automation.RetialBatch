package Testing;

import org.testng.annotations.Test;

public class Invocation {

	@Test(invocationCount = 5)
	public void testInvocation() {
		System.out.println("TestInvocation  executed....");
	}

	/**
	 * Timeout is max no of msec for each invocation of test
	 * Invocation timeout is max no of msec for all invocation together
	 * @throws InterruptedException
	 */
	@Test(invocationCount = 5, invocationTimeOut = 5000)
	public void testInvocationTimeOut() throws InterruptedException {
		System.out.println("TestInvocationTimeOut  executed....");
		Thread.sleep(1000);
	}

}
