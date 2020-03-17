package testng_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Junitdemo {
@After
public static void testcase1() {
	System.out.println("After");
}

@Before
public static void testcase2() {
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
