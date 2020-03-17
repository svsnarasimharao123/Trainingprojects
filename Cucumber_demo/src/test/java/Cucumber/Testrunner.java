package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunner {
	/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(features= "feature/testcase.feature", glue="Stepdefinition")
	public class Testrunner_googlehomepage
	{
	}  


}
