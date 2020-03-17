package Begininglaunch_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstbrowser {
	public static void main(String args[]) {
		
	
				 System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://www.google.co.in/");
	}

}
