package testng_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitpgm {
	@Test
	public void testcase() {
		System.out.println("After");
	}
	@After
	public  void testcase1() {
		System.out.println("After");
	}

	@Before
	public  void testcase2() {
		System.out.println("Before");
	}

	@AfterClass
	public static void testcase3() {
		System.out.println("Afterclass");
	}

	@BeforeClass
	public static void testcase4() {
		System.out.println("Beforeclass");
		
	}

}
