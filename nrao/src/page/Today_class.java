package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Today_class {
	
	WebDriver driver;
	By Currency=By.id("dropdownCurrency");
	By USD=By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]");
	By Offers=By.xpath("/html/body/div[2]/div[1]/div[3]/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/a");
	By Summer=By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div/div[2]/div/div/div[7]/div/div[2]/div/div[3]/div/div/a");
	By Name=By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[1]/input");
	By Phone=By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[2]/input");
	By Message=By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[4]/textarea");
	By Connect=By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[6]/input[3]");
	
	
	public Today_class(WebDriver driver) {
		this.driver=driver;
	}
public void Currency_change() {
	
	driver.findElement(Currency).click();
	driver.findElement(USD).click();
}
public void Offers_Click() {
	
	driver.findElement(Offers).click();
}
public void Summervocation_click() {
	
	driver.findElement(Summer).click();
}
public void Enter_Details() {
	driver.findElement(Name).sendKeys("Narsimha");
	driver.findElement(Phone).sendKeys("8546585858");
	driver.findElement(Message).sendKeys("Hello");
		
}
public void Connect_click() {
	driver.findElement(Connect).click();
}
}
