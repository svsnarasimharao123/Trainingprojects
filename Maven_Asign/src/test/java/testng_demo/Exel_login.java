package testng_demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Exel_login {
	public void excel() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream(new File("C:/Users/BLTuser.BLT0209/Desktop/Book1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("data");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		
		
		for(int i=1;i<=count;i++)
		{
			
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String un=cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
		String pwd=cell1.getStringCellValue();
		         System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		         ChromeDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 driver.get("https://opensource-demo.orangehrmlive.com/");
				 driver.findElement(By.id("txtUsername")).sendKeys(un);
				 driver.findElement(By.id("txtPassword")).sendKeys(pwd);
				 driver.findElement(By.id("btnLogin")).click();
			     
		 Thread.sleep(1000);		
         driver.close();
         workbook.close();
}
	}
}