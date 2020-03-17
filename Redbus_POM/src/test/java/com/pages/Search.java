package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	By Source= By.xpath("//*[@id=\"src\"]");
	By Destination= By.xpath("//*[@id=\"dest\"]");
	By Onwarddate=By.className("db text-trans-uc move-up");
	public Search(WebDriver driver)
	{
	this.driver=driver;
	}
	public void Source_Enter(String abcd) {
			driver.findElement(Source).sendKeys(abcd);
			}

	public void Destination_Enter(String ab) {
		
		driver.findElement(Destination).sendKeys(ab);
}
	public void Onward_date() {
		
		driver.findElement(Onwarddate);
			
		
	}
	}