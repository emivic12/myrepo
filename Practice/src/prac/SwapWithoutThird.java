package prac;

import java.util.HashMap;
import java.util.Map;

public class SwapWithoutThird {

	public static void main(String[] args) {
	int[] val=new int[] {5,8,2,9};
	int temp=0;
	for(int i=0;i<val.length-1;i++) {
		for(int j=i+1;j<val.length-1;j++) {
			if(val[i]>val[j]) {
				temp=val[i];
				val[i]=val[j];
				val[j]=temp;
				
				
			}
			
		}
	
		}
	
		System.out.println(val[val.length-3]);
	}
	
	}
		