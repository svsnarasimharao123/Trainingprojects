package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String args[]) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://examples.codecharge.com/store/default.php");
	WebElement we=driver.findElement(By.name("category_id"));
			Select sel=new Select(we);
	sel.selectByVisibleText("HTML & Web design");

	
	
	
	
	
	}









}