package day1;

public class Methods {

	  int s=10;
	public void methodname(int x, int y) {
	
	System.out.println(x+y);
		
	}
	
	
	public static void run() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		//classname objectname=new classname();
		Methods mt=new Methods();
		mt.methodname(4, 5);
		run();
		System.out.println(mt.s);

	}

}
