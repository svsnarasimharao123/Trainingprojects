package testng_demo;


import org.testng.annotations.Test;

public class DependsonGroup {
	@Test(groups= {"functional testing","smoke testing"})
	public void Login() 
	{
		System.out.println("Testcase1");
	}

	@Test(groups= {"functional testing","sanity testing"})
	public void Search() 
	{
		System.out.println("Testcase2");
		
		
	}
	@Test(groups= {"regrassion testing","re testing"})
	public void Logout()
	{
		System.out.println("Testcase3");

	}

}
