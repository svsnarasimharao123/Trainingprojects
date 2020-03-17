package tset;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Wrapperex;
import page.Today_class;

public class Today_test  extends Wrapperex {

	@BeforeClass
	public void Startup() {
		launchapp("https://www.phptravels.net/home");

	}
	@Test
	public void open() {
		Today_class a=new Today_class(driver);
		a.Currency_change();
		a.Offers_Click();
		a.Summervocation_click();
		a.Enter_Details();
		a.Connect_click();
	}
	
	@AfterClass
	public void clear(){
		quit();
	}
}


