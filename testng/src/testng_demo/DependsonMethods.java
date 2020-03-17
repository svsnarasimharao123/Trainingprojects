package testng_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods {
	@Test
	public void Login() 
	{
		System.out.println("Login");
	}

	@Test(dependsOnMethods= {"Login"})
	public void Search() 
	{
		System.out.println("Search");
		Assert.assertEquals("abc", "xyz");
		
	}
	@Test(dependsOnMethods= {"Search"},alwaysRun=false)
	public void Logout()
	{
		System.out.println("Logout");

	}

}
