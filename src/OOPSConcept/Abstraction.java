package OOPSConcept;

abstract class Employee{
	int empno;
	String empname;
	abstract void printDetails() ;
	abstract void getData(String empname,int empno);
}

class SubEmployee extends Employee{
	 void printDetails() {
		System.out.println("Employee number"+empno+"\n"+"Employee name"+empname);
	}
	
	 void getData(String empname,int empno) {
		 this.empname=empname;
		 this.empno=empno;
	 }
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e=new SubEmployee();
   e.getData("Muskan Mishra", 1);
   e.printDetails();
   

}
	}