package testng_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class NewTest {

  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();
		    }

  WebDriver driver;
 @Test
	 public void Navigate() 
 {
	 WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a"));
	 WebElement b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/ul/li[5]/a"));
	 Actions action=new Actions(driver);
	 action.moveToElement(a);
	 action.moveToElement(b).click().build().perform();
	
 }
				  
@Test
public void logout()
{
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]"));
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
}

			
  
 
 @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
