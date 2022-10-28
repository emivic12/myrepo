package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scenarios {
	public static WebDriver driver;
  
  @Test
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emily\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		  String title=driver.getTitle();
		  System.out.println(title);
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).perform();
		  SoftAssert sfa=new SoftAssert();
		  sfa.assertEquals(title, "hello", "title mismcatch");
		  sfa.assertNull(title);
		  sfa.assertAll();
}
  @Test
  public void ssl() {
	  ChromeOptions handling=new ChromeOptions();
	  handling.setAcceptInsecureCerts(true);
	  WebDriver driver=new ChromeDriver(handling);
	  driver.get("https://expired.badssl.com/");
  }
}