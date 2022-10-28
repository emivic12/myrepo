package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	WebDriver driver;
	
	By username=By.xpath("oxd-input oxd-input--active");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//button[@type='submit']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	public void verifylusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginbutton() {
		driver.findElement(login).click();
	}

}
