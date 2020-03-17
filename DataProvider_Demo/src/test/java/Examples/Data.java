package Examples;

import junit.framework.Test;

public class Data {
	
@Test(dataProvider = "Testdata") 
		publicvoid login(String username, String password) { 
		 driver.findElement(By.id("email")).sendKeys(username); 
		 driver.findElement(By.id("pass")).sendKeys(password); 
		 driver.close(); 
		 } 
		publicFirefoxDriverdriver; .
		@BeforeMethod 
		publicvoidbeforeMethod() { 
		 driver = newFirefoxDriver(); 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://facebook.com"); 
		 } 
		@DataProvider (name= "Testdata") 
		public Object[][] getdata() { 
		 Object[][] data = new Object[3][2] ; 
		 data [0][0] = "user1"; 
		 data [0][1] ="password1"; 
		 data [1][0] ="user2"; 
		 data [2][0] ="password1"; 
		 data [2][1] ="user3"; 
		 data [2][1] ="password3"; 
		 
		returndata; 
		 } 
		}
}
