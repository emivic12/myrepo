package cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		int[] ar= {1,1,4,6,7};
		int s=ar.length;
		boolean[] visited=new boolean[s];
		for(int i=0;i<s;i++) {
			
				if(visited[i]=true) 
					continue;
				int count=1;
				for(int j=i+1;j<s;j++) {
					if(ar[i]==ar[j]);
					
				 count++;
				}
				System.out.println(ar[i] +count);
			}
		
		}
	}

