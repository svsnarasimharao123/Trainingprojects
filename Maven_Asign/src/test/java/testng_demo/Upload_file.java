package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {
	public static void main(String args[]) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.tinyupload.com/");
	driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\BLTuser.BLT0209\\Desktop\\Book1.xlsx");
driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
	
	
	
	}
}