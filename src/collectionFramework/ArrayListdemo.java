package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> arr=new ArrayList<Integer>();
     arr.add(10);
     arr.add(50);
     arr.add(1, 10);
     
     System.out.println("Array List ="+arr);
     
     LinkedList<Integer> ll=new LinkedList<>();
     ll.add(90);
     ll.addFirst(45);
     ll.addLast(30);
     System.out.println("Linked List ="+ll);
     arr.addAll(ll);
    
     System.out.println("ArrayList + Linked List ="+arr);
     
     arr.remove(0);
     System.out.println("Array List ="+arr);
     ll.remove(1);
     System.out.println("Linked List ="+ll);
     ll.addAll(arr);
     ll.set(0, 90);
     System.out.println(ll);
     ll.removeFirst();
     System.out.println();
     System.out.println("Linked List ="+ll);
//     ll.clear();
     Object a[]= ll.toArray();
     System.out.println(a[0]);
     
     
     Iterator<Integer> it=ll.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
	}

}
