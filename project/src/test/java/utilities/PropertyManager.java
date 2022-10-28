package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
 
	 public static Properties properties;
	private static String configpath="C:\\Users\\Admin\\git\\selemniumjavaframework2\\project\\property\\configuration.properties";
		//declare properties object
		public static void initializeProperties() {
		properties=new Properties();
		//read config properties file
		try {
			properties.load(new FileInputStream(configpath));
		}
		catch(IOException e) {
			System.out.println("File cannot be found");
		}
		
	}
	
}
