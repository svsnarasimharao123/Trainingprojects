package asdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		System.setProperty("wbdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver=new ChromeDriver();
				
				
				driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
