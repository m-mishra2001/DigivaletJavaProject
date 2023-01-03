package OOPSConcept;

interface Shape2 {
double Area();

}
interface TwoDshape extends Shape2{
	void shapeType();
	double parameter();
}
interface ThreeDshapes extends Shape2{
	void shapeType();
	double volume();
	
}

class Rectangle2 implements TwoDshape{
	private double length;
	private double breadth;
	Rectangle2(){
		length=0;
		breadth=0;
	}
	Rectangle2(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double Area() {
		return length*breadth;
	}
	public double parameter() {
		return (4+(length*breadth));
	}
	public void shapeType() {
		System.out.println("Shape Type=Rectangle");
	}
}

class Cuboid implements ThreeDshapes{
	private double length;
	private double breadth;
	private double height;
	Cuboid(){
		length=0;
		breadth=0;
		height=0;
	}
	Cuboid(double length,double breadth,double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
	}
	public void shapeType() {
		System.out.println("Shape Type= Cuboid");
	}
	public double Area() {
		return (2*length*breadth+2*breadth*height+2*height*length);
	}
	public double volume(){
		return(length*breadth*height);
	}
}

class S2{
	public static void main(String[]args) {
		TwoDshape s1=new Rectangle2(3.5,6.7);
		ThreeDshapes s2=new Cuboid(2.3,4.5,6.7);
		s1.shapeType();
		System.out.println("Area="+s1.Area()+"\nParameter="+s1.parameter());
		s2.shapeType();
		System.out.println("Area="+s2.Area()+"\nVolume="+s2.volume());
		
	}
}