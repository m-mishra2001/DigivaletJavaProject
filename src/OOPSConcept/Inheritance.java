package OOPSConcept;

class Animal{
	void eat() {
		System.out.println("eating....");
	}
}

class Dogg extends Animal{
	void bark() {
		System.out.println("barking......");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogg d=new Dogg();
		d.bark();
		d.eat();

	}

}
