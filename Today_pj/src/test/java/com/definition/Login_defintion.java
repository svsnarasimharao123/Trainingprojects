package com.definition;

import com.pages.login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_defintion {
	
	 login_page l=new login_page();
	
	@Given("^The user launces the chrome browser$")
	public void the_user_launces_the_chrome_browser() throws Throwable {
	  
		l.Launchapp();
	}

	@When("^the demoblaze website open$")
	public void the_demoblaze_website_open() throws Throwable {
	   l. Loginclick();
	}

	@Then("^the user enter the username and password$")
	public void the_user_enter_the_username_and_password() throws Throwable {
	   
		l.Enter_Username();
		l.Enter_Password();
	}
	@Then("^the user clicks the login  button$")
	public void the_user_clicks_the_login_button()  {
	   l.Login_But();
	}

	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   l.close();
	}

	
	
}
