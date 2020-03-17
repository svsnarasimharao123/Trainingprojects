package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_page {
	WebDriver driver;
	By contact=By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
	By Contactemail=By.xpath("//*[@id=\"recipient-email\"]");
	By Contactname=By.xpath("//*[@id=\"recipient-name\"]");
	By Message=By.xpath("//*[@id=\"message-text\"]");
	By sendclick=By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
	
	public void Launchapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
			
	}
	
	public void contactclick() {
		
		driver.findElement(contact).click();
		
		
	}
public void Enter_contactemail() {
	
	driver.findElement(Contactemail).sendKeys("svssnarasimharao@gmail.com");
		
}
public void Enter_contactname() {
	
	driver.findElement(Contactname).sendKeys("12356856");
	
}
public void Enter_message() {
	
	driver.findElement(Message).sendKeys("Hello");
}
public void Sendmessage_button() {
	
	driver.findElement(sendclick).click();
	}
}
