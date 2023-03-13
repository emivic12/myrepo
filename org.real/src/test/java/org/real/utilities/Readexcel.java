package org.real.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Readexcel {
 public void readExcel() throws FileNotFoundException {
	 
	 Readproperty pro=new Readproperty();
	 FileInputStream fin=new FileInputStream(pro.getexcelpath());
	 
 }
	
}
