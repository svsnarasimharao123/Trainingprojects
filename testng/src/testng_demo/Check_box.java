package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {
public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	
	driver.findElement(By.id("small-searchterms")).sendKeys("book");
	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.id("As")).click();
	
	
	

	
	
	
}
}
