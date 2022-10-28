package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;
import utilities.PropertyManager;

public class NewTest {
	WebDriver driver;
  @BeforeClass
  public static void beforeclass() {
	  PropertyManager.initializeProperties();
  }
	
  @Test
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emily\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(PropertyManager.properties.getProperty("url"));
	 String title= driver.getTitle();
	 System.out.println(title);
	 driver.manage().window().maximize();
	  Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM", "Title does not match");
	   
  }
 public void login () {
	 LoginPageObjects log=new LoginPageObjects(driver);
	 Reporter.log("Browser Launched");
	 log.verifylusername("Admin");
	 log.password("admin123");
	 log.loginbutton();
 }
}
