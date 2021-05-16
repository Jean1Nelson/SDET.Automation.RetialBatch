package testngparallelexecution;

import org.testng.annotations.Test;

public class ParallelTest3 {

	
	
	
	@Test
	public void test31()
	{
		System.out.println("Test 31 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test32()
	{
		System.out.println("Test 32 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test33()
	{
		System.out.println("Test 33 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	@Test(invocationCount = 5, threadPoolSize = 5, timeOut = 2000)
	public void test34()
	{
		System.out.println("Test 31 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
}
