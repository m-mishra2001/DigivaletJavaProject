package OOPSConcept;

class ScopeForProtected{
	protected void methodA() {
		System.out.println("Inside the Protected member A.......");
	}
}

class Secondclass extends ScopeForProtected {
	
	protected void methodB() {
		System.out.println("Inside the Protected member B.......");
	}
}
public class CheckingScopeForProtectedMembers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeForProtected a=new ScopeForProtected();
		a.methodA();
	}

}
