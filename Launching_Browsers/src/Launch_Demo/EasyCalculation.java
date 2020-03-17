package Launch_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalculation {
@Test
public void EasyCalculationopen()
{
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	System.setProperty("webdriver.driver.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easycalculation.com/");
	System.out.println(driver.getTitle());
	driver.close();
}
}
