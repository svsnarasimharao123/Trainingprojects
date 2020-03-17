package Launch_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetexplorerBrowser {
@Test
public void Launchinternetexplorer() {
	
	
	System.setProperty("webdriver.ie.driver","D:\\SeleniumJars\\Internet Explorer Driver\\IEDriverServer.exe");
	System.setProperty("webdriver.ie.bin","C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
	
	WebDriver driver=new InternetExplorerDriver();
			
			
			driver.manage().window().maximize(); // size fit to window
	driver.get("https://www.google.co.in/"); //get is the method which having the title of browser
	System.out.println(driver.getTitle());
	
	    driver.close(); //closes the opened browser window
}
}
