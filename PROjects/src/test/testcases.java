package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import baseclass.Wrapperex;
import page.mainpage;

public class testcases extends Wrapperex {
	@BeforeClass
	  public void startup() {
		  Launchapp("https://www.demoblaze.com/");
	  }
	  @Test
	  public void Login() {
		  
		  mainpage a=new mainpage();
		  a.Login_click();
		  a.Enter_Usename("narasimha");
		  a.Enter_Password("Narasimha");
		  a.Loginbt();
		  
	  }
	  
	  @Test
		  public void contact() {
		  
		  
			  
		  }
		  
		  
	  
	  @AfterClass
	  public void afterClass() {
		  
		  quitt();
	  }
	  
	}

