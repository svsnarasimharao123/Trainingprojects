package baseclass;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Wrapperex {
	protected WebDriver driver;
	public void Launchapp(String url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(url);
		
		}
	public void pic() throws IOException {
		TakesScreenshot logo =((TakesScreenshot)driver);
		 File file=logo.getScreenshotAs(OutputType.FILE);
	Files.copy(file,new File(("C:\\Users\\BLTuser.BLT0209\\eclipse-workspace\\PROjects\\Sceenshot)")));
	}
	
		public void quitt() {
			
			driver.close();
		}

}
