package testng_demo;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	public class Dataprovidercl {
	
		WebDriver driver;
		@Test(dataProvider="Testdata")
		public void login(String un, String pwd) {
			
			driver.findElement(By.id("txtUsername")).sendKeys(un);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		}
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@DataProvider(name="Testdata")
	public Object[][] getdata(){
		Object[][]data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="username2";
		data[1][1]="password2";
		data[2][0]="username3";
	    data[2][1]="password3";	
	    
	    return data;
	}

	}

		

