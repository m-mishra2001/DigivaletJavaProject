package collectionFramework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack s1=new Stack();
		s1.add("Muskan");
		s1.push(10);
		s1.add(1, 45.70);
		
		System.out.println(s1);
		
		s1.remove("Muskan");
		System.out.println(s1);
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
//		s.addAll(s1);
		s.push(50);
		s.push(48);
		s.push(34);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(10));
		System.out.println(s.empty());
		System.out.println(s);
	}

}
