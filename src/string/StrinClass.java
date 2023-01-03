package string;

public class StrinClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Muskan Mishra";
String s2="Muskan Mishra";
//checking if s1 and s2 pointing to same instance or not
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
		s2="muskan mishra";
		System.out.println(s1.equalsIgnoreCase(s2));
		int a=1;
		String str=Integer.toString(a);
		System.out.println(str+2);
		str="Hello#i#am#muskan#mishra";
		String []arr=str.split("#");
		for(String s:arr) {
			System.out.println(s+" ");	
		}
		System.out.println(str.replace("#", "%"));
		System.out.println(str.concat(s2));
		System.out.println(s2.substring(0,6));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
