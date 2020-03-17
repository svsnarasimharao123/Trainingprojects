package com.Baseutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapperex {
	protected WebDriver driver;
	public void Launchapp(String url) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get(url);
	
	}
	public void quitt() {
		
		driver.close();
	}

}
