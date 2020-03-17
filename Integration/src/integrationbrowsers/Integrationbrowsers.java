package integrationbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Integrationbrowsers {
	@Test(priority=2)
	public void launchfirefox()
	{
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumJars\\Firefox Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
				
				
				driver.manage().window().maximize(); 
		driver.get("https://www.google.co.in/"); 
		System.out.println(driver.getTitle());
		
		    driver.quit(); 
	}

		
	@Test(priority=3)
		public void chromebrowseropen() {
			
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
				
				
				driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	@Test(priority=1)
	public void Launchinternetexplorer() {
		
		System.setProperty("webdriver.ie.driver","D:\\SeleniumJars\\Internet Explorer Driver\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
				
				
				driver.manage().window().maximize(); 
		driver.get("https://www.google.co.in/"); 
		System.out.println(driver.getTitle());
		
		    driver.close(); 


	}

	}

