package Testcases;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import Library.WrapperEx;

import Pages.Orangehrm_login;
import Pages.Orangehrm_logout;

	public class Testcaselogin extends WrapperEx{
		
		@BeforeClass
		public void startUp() {

			
			launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
		}
		
	    @Test
		
		public void login()
		{
			
	    	Orangehrm_login lpage=new Orangehrm_login(driver);
		    lpage.loginToApp_username("Admin");
		    lpage.loginToApp_password("admin123");
			lpage.loginToApp_Loginbutton();
		}
	    
	    @Test(dependsOnMethods= {"login"})
	    public void lougout()
	    {
	    	Orangehrm_logout page=new Orangehrm_logout(driver);
	    		
	    	page.logout();
	    	
	    }
	    @AfterClass
		public void close()  {
			
			quit();
		}

	}



