package testng_demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby_pixel {
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
}
}