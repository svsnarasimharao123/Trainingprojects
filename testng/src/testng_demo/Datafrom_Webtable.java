package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datafrom_Webtable {

	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		int r,c;String xp;
		for(r=2;r<=7;r++)
		{
			
			for(c=1;c<=3;c++) {
				
				xp="//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]";
				String s=driver.findElement(By.xpath(xp)).getText();
				System.out.print(s+"    ");
			}
			System.out.println();
		
		}
		
		
		
		
}
	
	
	
}