package org.real.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {
	
	 Properties prop;
public Readproperty(){
	
File src=new File("./config.properties");
	
	try {
	FileInputStream fin=new FileInputStream(src);
	prop=new Properties();
	prop.load(fin);
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}}
	public String getexcelpath(){
		String excelpath=prop.getProperty("path");
		return excelpath;
		
}

}
