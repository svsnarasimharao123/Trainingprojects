package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Wrapperex;
import com.pages.Search;

public class Testcase extends Wrapperex{
	@BeforeClass
	public void startUp() {

		
		launchApplication("chrome", "https://www.redbus.in/");
	}
	
    @Test
		public void Source()
	{
    	Search lpage=new Search(driver);
	    lpage.Source_Enter("Kanigiri");
	    lpage.Destination_Enter("Chennai");
	    lpage.Onward_date().click();
	
	}
    
 
    @AfterClass
	public void close() throws InterruptedException  {
		
		quit();
		Thread.sleep(3000);
	}

}
