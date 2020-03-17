package com.definition;

import com.pages.Contact_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact_definition extends Contact_page {
	@Given("^The application opens in the browser$")
	public void the_application_opens_in_the_browser()  {
	    Launchapp();
	}

	@When("^the user navigates to  the contact link$")
	public void the_user_navigates_to_the_contact_link()  {
		contactclick();
	}

	
	@Then("^enter the email,name in respective text boxes$")
	public void enter_the_email_name_in_respective_text_boxes()  {
	    
	
	Enter_contactemail();
	Enter_contactname();
	}

	@Then("^message in the message textbox$")
	public void message_in_the_message_textbox()  {
		Enter_message();
	}

	@Then("^click on the send message button$")
	public void click_on_the_send_message_button()  {
		Sendmessage_button();
	}


	
	

}
