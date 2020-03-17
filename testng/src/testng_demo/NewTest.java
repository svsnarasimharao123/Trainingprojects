package testng_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Testcase1() {
	  System.out.println("TestCase1");
  }
  @Test
  public void Testcase2() {
	  System.out.println("TestCase2");
  }
  @Test
  public void Testcase3() {
	  System.out.println("TestCase3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod:Launch App");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod:Close App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass:PrepareTestData");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass:Clear log");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest:Open Db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest:Close Db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite:Smoketesting");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite:Generatereports");
  }

}
