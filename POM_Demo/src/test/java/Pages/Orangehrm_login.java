package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Orangehrm_login {
	
	WebDriver driver;
	By username= By.id("txtUsername");
	By password= By.name("txtPassword");
	By loginbutton=By.id("btnLogin");
	
	public Orangehrm_login(WebDriver driver)
	{
	this.driver=driver;
	}
	public void loginToApp_username(String userid)
	{

	driver.findElement(username).sendKeys(userid);
		}	
	public void loginToApp_password(String pass)
	{

		driver.findElement(password).sendKeys(pass);
	
	}	
	public void loginToApp_Loginbutton()
	{

	driver.findElement(loginbutton).click();
	}
	
}








