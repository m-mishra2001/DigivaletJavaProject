package string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb1=new StringBuffer();
       System.out.println(sb1.capacity());
       sb1.append("Muskan Mishra course:-Btech cse ");
       System.out.println(sb1.capacity());
       StringBuffer sb2=new StringBuffer("Muskan");
       
       System.out.println(sb2.capacity());
       sb2.append(" Mishra jkdhfdj ksdjcfhkjsd jkdfhcksjdef");
       System.out.println(sb2);
       System.out.println(sb2.capacity());
       
       System.out.println(sb2.replace(14, sb2.length(),"Btech"));
//       System.out.println(sb2.reverse());
       sb2.delete(14, sb2.length());
       System.out.println(sb2);
       System.out.println(sb2.charAt(0));
       
       StringBuffer sb3=new StringBuffer("java");
       StringBuffer sb4=new StringBuffer("java");
       System.out.println("String Buffer comaprision "+sb3.equals(sb4));
       String s1=sb3.toString();
       String s2=sb4.toString();
       System.out.println("Content comparision "+s1.equals(s2));
       System.out.println("Reference comparision"+s1==s2);
       
       StringBuilder s=new StringBuilder("Muskan");
       System.out.println(s.toString());
       s.append('M');
       System.out.println(s);
       System.out.println(s.capacity());
	}

}
