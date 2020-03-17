package Begininglaunch_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String args[])
{
	 System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.name("Submit")).click();
	//driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
	// driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	 //driver.findElement(By.xpath("//*[@id='btnLogin'and @name='Submit']")).click();
    //driver.findElement(By.xpath("//*[@id='btnLogin'or @name='Submit']")).click();
  //driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
   // driver.findElement(By.xpath("//*[contains(@name,'Submit')]")).click(); 
    driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();
	 
	 

}}