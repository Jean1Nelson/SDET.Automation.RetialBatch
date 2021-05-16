package testngparallelexecution;

import org.testng.annotations.Test;

public class ParallelTest1 {

	@Test
	public void test11()
	{
		System.out.println("Test 11 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test12()
	{
		System.out.println("Test 12 Execution.........."+ Thread.currentThread().getId());
	}
	
	
	
	@Test
	public void test13()
	{
		System.out.println("Test 13 Execution.........."+ Thread.currentThread().getId());
	}
	
}
