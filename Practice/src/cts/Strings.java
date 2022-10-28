package cts;

public class Strings {

	public static void main(String[] args) {
		
		 int[] arr= {1,5,6,7,1,5};
		 int n=arr.length;
		 boolean[] visited=new boolean[n];
		 System.out.println(visited[0]);
		 for(int i=0;i<n;i++) {
			 if(visited[i]==true) 
				 continue;
			 int count=1;
			 for(int j=i+1;j<n;j++){
					 if(arr[i]==arr[j]) {
						 visited[j]=true;
						 count++;
						
					 }
				 
			 }
			 System.out.println(arr[i] + " " +count);
		 }
			 
		 }
}
		 
	     


