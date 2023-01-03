package common;

class OfficeEmployee{
	int id;
	String name;
	public static int count=1;
	
	OfficeEmployee(int id,String name){
		this.id=id;
		this.name=name;
		++count;
	}
	
	void printDetails() {
		System.out.println("Employee ID ="+id);
		System.out.println("Employee Name ="+name);
	
	}
	
	void showCount() {
		System.out.println(count);
	}
	
	protected void finalize() {
		--count;
	}
}

public class FinalizationGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		OfficeEmployee e1=new OfficeEmployee(OfficeEmployee.count,"Muskan");
		OfficeEmployee e2=new OfficeEmployee(OfficeEmployee.count,"Shreya");
		e1.printDetails();
		e2.printDetails();
		e1.showCount();
		e2.showCount();
		{
		OfficeEmployee e3=new OfficeEmployee(OfficeEmployee.count,"Mahesh");	
		e3=null;
		System.gc();
		System.runFinalization();
		}
		e1.showCount();
	}

}
