package OOPSConcept;

class Student {

	private int sid;
	private String name;
	private String course;
	
	void setSid(int sid) {
	this.sid=sid;	
	}
	void setName(String name){
		this.name=name;
	}
	void setCourse(String course) {
		this.course=course;
	}
	
	int getSid() {
		return sid;
	}
	String getName() {
		return name;
	}
	String getCourse() {
		return course;
	}
	
	
	
}

class Main{
	public static void main(String[]args) {
		Student stud=new Student();
		stud.setSid(1);
		stud.setName("Muskan");
		stud.setCourse("computer Science");
       
		System.out.println("name:-"+stud.getName()+"\n"+"enrollment:-"+stud.getSid()+"\n"+"Course:-"+stud.getCourse());
	}
}