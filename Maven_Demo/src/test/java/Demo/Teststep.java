package Demo;

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
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 driver =  new ChromeDriver();
		
			
	}
	@When("^I open Google Home pages$")
	public void I_open_Google_Home_pages() {
		driver.get("https://www.google.com/"); 
		System.out.println(driver.getTitle());
	}
	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() {
		WebElement txtbox=driver.findElement(By.name("q"));
		System.out.println(txtbox.isDisplayed());
		
	}
	@Then("^i verify that text is entered and  searched$")
	public void i_verify_that_text_is_entered_and_searched() {
		WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
		txtbox.sendKeys("Hello Welcome");
		System.out.println(txtbox.isDisplayed());
}
	}

	@Then("^clicks the submit button$")
	public void clicks_the_submit_button() 
	{
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ENTER);
		driver.close();
		
	}
	
}
