package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teststep {
	WebDriver driver;

@Given("^I launch chrome browser$")
public void i_launch_chrome_browser()  {
	 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	    
}

@When("^I open Google Homepage$")
public void i_open_Google_Homepage() {
	 driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	    
}

@Then("^I verify that the page displays search text box$")
public void i_verify_that_the_page_displays_search_text_box()  {
	WebElement txtbox=driver.findElement(By.name("q"));
	txtbox.sendKeys("Hello Welcome");
	System.out.println(txtbox.isDisplayed());

}

@Then("^I verify that text is entered and searched$")
public void i_verify_that_text_is_entered_and_searched()  {
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled()) {
		
		txtbox.sendKeys("Hello Welcome");
	}
}

@Then("^click the submit button$")
public void click_the_submit_button()  {
	Actions action =new Actions(driver);
	action.sendKeys(Keys.ENTER);
	driver.close();
}
}
