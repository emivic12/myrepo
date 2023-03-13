package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base  {
	WebDriver driver;
	public Properties prop;
	
	public WebDriver 	Initializebrowser() throws IOException {
		 prop=new Properties();
		String proppath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";//get the path of project
		FileInputStream fis=new FileInputStream(proppath);
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	
}