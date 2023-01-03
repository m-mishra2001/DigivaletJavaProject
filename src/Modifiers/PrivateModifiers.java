package Modifiers;

class Private{
//	 private class A{
//		 void print() {
//			 System.out.println("Here we are inside the private class");
//		 }
//	 }
}
 class PrivateModifiers {

	 private class A{
		 void print() {
			 System.out.println("Here we are inside the private class");
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PrivateModifiers p=new PrivateModifiers();
     A a=p.new A();
     a.print();
	}

}
