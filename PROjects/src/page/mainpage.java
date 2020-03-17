package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainpage {
	WebDriver driver;
	By Loginnav=By.xpath("//*[@id=\"login2\"]");
	By Username=By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input");
	By Password=By.xpath("//*[@id=\"loginpassword\"]");
	By Loginbt=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

	public void Loginpage(WebDriver driver)
	{
	this.driver=driver;
	}
	public void Login_click() {
		driver.findElement(Loginnav).click();
	}
	
	public void Enter_Usename(String Userid) {
		driver.findElement(Username).sendKeys(Userid);
		
		
	}
	public void Enter_Password(String Userpaw) {
		driver.findElement(Password).sendKeys(Userpaw);
		
	
	}
	
	
	public void Loginbt() {
		
		driver.findElement(Loginbt).click();
	}
}



