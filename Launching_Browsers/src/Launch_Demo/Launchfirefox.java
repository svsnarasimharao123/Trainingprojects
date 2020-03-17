package Launch_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchfirefox {
@Test
public void launchfirefox()
{
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumJars\\Firefox Driver\\geckodriver.exe");
	System.setProperty("webdriver.driver.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	
	WebDriver driver=new FirefoxDriver();
			
			
			driver.manage().window().maximize(); // size fit to window
	driver.get("https://www.google.co.in/"); //get is the method which having the title of browser
	System.out.println(driver.getTitle());
	
	    driver.quit(); //closes the opened browser window
}
	



}


