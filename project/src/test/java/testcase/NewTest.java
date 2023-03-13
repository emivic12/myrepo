package testcase;

import org.openqa.selenium.By;
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
	
  @Test(enabled=false)
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emily\\chrome106\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	 driver.manage().window().maximize();
	 //no of rows
	int rowcount= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
	int colcount=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]/td")).size();
	for(int k=1;k<=colcount;k++) {
		System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//"+"td["+k+"]")).getText()+"yes");
	}
	String firstpart="//table[@id='customers']//tbody//tr[";
	String secondpart="]/td[";
	String thirdpart="]";
	
	for(int i=2;i<=rowcount;i++){
		for(int j=1;j<=colcount;j++) {
			String finalpath=firstpart+i+secondpart+j+thirdpart;
			String tabledata=driver.findElement(By.xpath(finalpath)).getText();
			System.out.println(tabledata);
			
		}
		System.out.println("");
		System.out.println("");
	}
	   
  }
@Test
public void tabledata() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emily\\chrome106\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	 driver.manage().window().maximize();
}
 
}
