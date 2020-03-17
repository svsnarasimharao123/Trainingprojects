package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\main\resources\\feature\\Today.feature",
		tags="@tc02_demoblazecontact",
		glue="com.definition",
		monochrome=true
		)
		



public class Contact_runner {

}
