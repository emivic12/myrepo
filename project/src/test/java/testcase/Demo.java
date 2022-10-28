package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	 @Test
	    public void parentTest() { 
		 Assert.assertEquals("hello", "value");
	      System.out.println("Running parent test.");
	    }
	   
	    @Test(dependsOnMethods={"parentTest"}) 
	    public void dependentTest() { 
	      System.out.println("Running dependent test.");
	    } 
}
