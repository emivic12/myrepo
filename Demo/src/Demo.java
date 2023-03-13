import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		int[] num= {1,1,4,5};
		int n=num.length;
		int count=1;
		boolean[] visited=new boolean[n];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++) {
			if(visited[i]==true)
				continue;
			for(int j=i+1;j<n;j++) {
				if(num[i]==num[j]) {
					visited[j]=true;
					count++;
					
				}
			}
			
			System.out.println(num[i]+"occurd"+count);
		}
		
		
		
	}
		
}


