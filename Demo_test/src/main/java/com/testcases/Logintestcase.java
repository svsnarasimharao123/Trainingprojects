package com.testcases;

import org.testng.annotations.Test;

import com.Baseutility.Wrapperex;
import com.pages.Loginpage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Logintestcase extends Wrapperex {
  
  @BeforeClass
  public void startup() {
	  Launchapp("https://www.demoblaze.com/");
  }
  @Test
  public void Login() {
	  
	  Loginpage a=new Loginpage(driver);
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
