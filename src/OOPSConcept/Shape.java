package OOPSConcept;

public interface Shape {
default void  demomethod() {
	System.out.println("Inside the default method");
}
static void demo() {
	System.out.println("Inside the static method");
}
 void shapetype();
	 float Area() ;
	double parameter();
	
}
class Rectangle implements Shape{
	private float length;
	private float breadth;
	Rectangle(float length,float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public  void shapetype() {
		
		System.out.println("Rectangle");
	}
	public float Area() {
		return this.length*this.breadth;
	}
	public double parameter() {
		return (2+(length*breadth));
	}
}

class square implements Shape{
	private float side;
	square(float side){
		this.side=side;
	}
	public void shapetype() {
		System.out.println("Square");
	}
	
	public float Area() {
		return side*side;
	}
	public double parameter() {
		return (4*side);
	}
	
}

 class S{
	public static void main(String[]args) {
		Shape s1=new Rectangle(7,9);
		Shape s2=new square(9);
		s1.shapetype();
		System.out.println("Area="+s1.Area()+"\nParameter="+s1.parameter());
		s2.shapetype();
		System.out.println("Area="+s2.Area()+"\nParameter="+s2.parameter());
		s1.demomethod();
	Shape.demo();
	}
}