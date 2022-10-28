package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Baseclass {
	
	public static Properties readproperty() throws FileNotFoundException {
		Properties prop=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\project\\property\\configuration.properties");
	return prop;
	
	}
	public static void initialize() {
		
	}

}
