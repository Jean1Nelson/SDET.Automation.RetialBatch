package testngparallelexecution;

import org.testng.annotations.Test;

public class ParallelTest2 {

	
	@Test
	public void test21()
	{
		System.out.println("Test 21 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test22()
	{
		System.out.println("Test 22 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test23()
	{
		System.out.println("Test 23 Execution.........."+ Thread.currentThread().getId());
	}
	
	
}
