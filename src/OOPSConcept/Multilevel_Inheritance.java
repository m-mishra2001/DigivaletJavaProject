package OOPSConcept;

class A{
	void amethod() {
		System.out.println("Inside A method .....");
	}
}

class B extends A{
	void bMethods() {
		System.out.println("Inside B Method...");
	}
}


class C extends B{
	void cMethod() {
		
		System.out.println("Inside c method.....");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.amethod();
c.bMethods();
c.cMethod();
	}

}
