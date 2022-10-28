package prac;

public class Reverse {

	public static void main(String[] args) {
		String s="hello";
		char[] c=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(c[i]);
		}

	}

}
