package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapperex {
	
	protected WebDriver driver;
	
	public void launchapp(String url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.get(url);
	}
	public void quit() {
		
		driver.close();
	}

}
