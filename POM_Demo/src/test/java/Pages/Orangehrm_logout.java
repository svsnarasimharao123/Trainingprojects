package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm_logout {
	WebDriver driver;
	
public Orangehrm_logout(WebDriver driver)
{
	this.driver=driver;
}


	
public void logout()
{
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();


	WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(a);
	action.moveToElement(a).click().build().perform();

	
	
}


}
