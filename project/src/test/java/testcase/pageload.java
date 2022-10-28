package testcase;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pageload {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emily\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// driver.get("http://the-internet.herokuapp.com/large");
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[contains(text(),'Monitors')]")).click();
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 try {
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@target='_blank']/div[2]//div)[2]"))).click();
	}
		 catch(NoSuchElementException e)
	{
		e.printStackTrace();
	}
		 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(windows.get(0));
		 System.out.println(windows.get(1));
		 driver.switchTo().window(windows.get(1));
		 try {
			 String value= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='aMaAEs']/div[3]//div/div//div)[1]"))).getText();
		 
		 System.out.println("price value" +value);}
		 catch(NoSuchElementException e) {
			 e.printStackTrace();
		 }

}
	@Test
	public void addtowishlist() {
		
	}
	
}