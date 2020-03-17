package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {
	WebDriver driver;
	By Login=By.xpath("//*[@id=\"login2\"]");
	By Username=By.id("loginusername");
	By Pasword=By.xpath("//*[@id=\"loginpassword\"]");
	By Loginbt=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");//("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	

	public void Launchapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
			
	}
	
	public void Loginclick() {
		
	driver.findElement(Login).click();	
	}
	public void Enter_Username() {
		
		
		driver.findElement(Username).sendKeys("narasimha");
	}
	
	public void Enter_Password() {
		
		driver.findElement(Pasword).sendKeys("Narasimha");
	}
	
	
	public void Login_But()  {
		
		
	driver.findElement(Loginbt).click();
	
	
	}
	
	
	public void close() throws InterruptedException  {
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
