package cts;

import java.util.Scanner;

public class Parse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		String one=sc.next();
		System.out.println("Enter value");
		String two=sc.next();
		String three;
		three=one+two;
		System.out.println(three);
		int i1=Integer.parseInt(one);
		int i2=Integer.parseInt(two);
		System.out.println(i1+i2);
		
    
     
	}

}
