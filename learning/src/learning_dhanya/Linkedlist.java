package learning_dhanya;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// DECLARE LINKED LIST
//
//		LinkedList l = new LinkedList();
////		LinkedList<Integer> w = new LinkedList<Integer> ();
////		LinkedList<String> c = new LinkedList<String> ();
////		
//
//		// Add element to the linked list
//
//		l.add(100);
//		l.add("welcome");
//		l.add(15.5);
//		l.add('A');
//		l.add(true);
//		l.add(null);
//		System.out.println(l);
//		System.out.println(l.size());
//
//		// remove
//
//		l.remove(3);// index
//
//		System.out.println(l);
//
//		// insert/adding element in the middle of linkedlist
//		l.add(3, "java");
//
//		System.out.println(l);
////		//retrive value/object
////		
//		System.out.println(l.get(3));
//
//		// change the value
//
//		l.set(5, "X");
//		System.out.println(l);
//
//		//contain
//		System.out.println(l.contains("java"));
//		
//		//isEmpty()
//		System.out.println(l.isEmpty());
//		
//		//reading objects/elements from linkedlist using for loop
//		
////		for(int i =0;i<l.size();i++) {
////			System.out.println(l.get(i));
////			
////			
////		}
//		
//		//resading using foreach loop
//		
//		
//		for(Object d : l) {
//			
//			System.out.println(d);
//		}
//		
//		//iterator
//		
//		Iterator data = l.iterator() ;
//		while(data.hasNext()) { //verify next value
//		
//		System.out.println(data.next());
//		
//		}
//	
	LinkedList value = new LinkedList ();
	value.add("C");
	value.add("B");
	value.add("D");
	LinkedList value1 = new LinkedList ();
		
	value1.addAll(value);
	System.out.println(value1);
	
	
//	value1.removeAll(value);
//	System.out.println(value1);
	
	//sort (sorting is possible if we have same kind of data)
	
	Collections.sort(value);
	System.out.println(value);
	
	
	//REVERSE ORDER
	
	Collections.sort(value,Collections.reverseOrder());
	System.out.println(value);
	
	//shuffle
	
	Collections.shuffle(value);
	System.out.println(value);
	
	//specific methods for linkedlist
	
	LinkedList value2 = new LinkedList();
	value2.add("dog");
	value2.add("goat");
	value2.add("raat");
	
	value2 .addFirst("myna");
	System.out.println(value2);
	
	
	value2 .addLast("pengiune");
	System.out.println(value2);
	
	

	System.out.println(value2 .getFirst());
	System.out.println(value2 .getLast());
	
	System.out.println(value2 .removeFirst());
	System.out.println(value2 .removeLast());
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
