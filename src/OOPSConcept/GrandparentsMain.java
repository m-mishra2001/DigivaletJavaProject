package OOPSConcept;
class Grandparent{
	Grandparent(){
		System.out.println("Inside the constructor of GrandParent  class....");
	}
  void demo() {
	  System.out.println("Inside the demo method of GrandParents");
  }
}

class Parents extends Grandparent{
	Parents(){
		super();
		System.out.println("Inside the constructor of Parents class....");
		
	}
}
class Child extends Parents{
	Child(){
		super();
	}
}

public class GrandparentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
