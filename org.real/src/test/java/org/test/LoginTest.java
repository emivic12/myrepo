package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import resources.Base;

public class LoginTest extends Base {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")));
		WebElement log=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]"));
		WebElement pass=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		log.sendKeys("hello");
		pass.sendKeys("12");
		
		
		
		
		
	}
		
	}
  