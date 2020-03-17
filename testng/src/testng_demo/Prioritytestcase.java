
package testng_demo;

import org.testng.annotations.Test;

public class Prioritytestcase 
{
@Test(priority=2)
public void Testcase1() 
{
	System.out.println("TestCase1");
}

@Test(priority=3,invocationCount=3,invocationTimeOut=5)
public void Testcase2() 
{
	System.out.println("TestCase2");
	
}
@Test(priority=1)
public void Testcase3()
{
	System.out.println("TestCase3");

}
}
