package prac;

public class SortInteger {

	public static void main(String[] args) {
		int[] iarray= {1,3,2,5,4,6};
		int temp=0;
		for(int i=0;i<iarray.length-1;i++) {
			for(int j=i+1;j<iarray.length-1;j++) {
				if(iarray[i]>iarray[j]) {
					temp=iarray[i];iarray[i]=iarray[j];iarray[j]=temp;
				}
				
			}System.out.println(iarray);
			
		}
		
	}

}
