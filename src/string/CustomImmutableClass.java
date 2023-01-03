package string;

final class Student{
	private final int sid;
	private final String name;
	Student(int sid, String name){
		this.sid=sid;
		this.name=name;
	}
	
	int  getsid() {
		return sid;
	}
	
	String getname() {
		return name;
	}
} 

 public class CustomImmutableClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student s=new Student(1,"Muskan");
  System.out.println(s.getname());
  System.out.println(s.getsid());
  s=new Student(2,"misha");
  System.out.println(s.getname());
  System.out.println(s.getsid());
	}

}
