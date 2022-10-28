
abstract class Abstactexample {
	abstract void Shape();}
	
class Rectangle extends Abstactexample{

	@Override
	void Shape() {
		System.out.println("Rshape");
		
	}}
class circle extends Abstactexample{

	@Override
	void Shape() {
		System.out.println("cshape");
		
	}
}

class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle c=new circle();
c.Shape();
	}}

