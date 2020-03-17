package testng_demo;

import org.testng.annotations.Test;

public class ParallelExecution {
	
		@Test
		public void Testcase1() 
		{
			System.out.println("TestCase1");
		}

		@Test
		public void Testcase2() 
		{
			System.out.println("TestCase2");
			
		}
		@Test
		public void Testcase3()
		{
			System.out.println("TestCase3");

		}
}
