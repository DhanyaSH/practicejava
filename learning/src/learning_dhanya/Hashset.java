package learning_dhanya;
import java.util.HashSet;
import java.util.Iterator;



public class Hashset {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Hashset hashset = new Hashset(); //dafault capacity is 16 and Loadfactor 0.75
	

//	HashSet set = new HashSet(100);//initial capacity 100
	
//	HashSet s = new HashSet(100,(float) 0.90);	
	HashSet h = new  HashSet(); //default caacity 16 Load factor 0.75 	
	
	
	//Add Objects/elements into Hashset

	
		h.add(100);
		h.add("WELCOME");
		h.add(10.5);
		h.add('A');
     	h.add(true);
	
	System.out.println(h); //insertion order is not preserved
	
	//remove
	
	h.remove('A');
	System.out.println(h);
	
	
	
	//directly we cannot get a specific value in hashset.to read data use loop statement
	//similarly we can not set a value
	
	//contains
	
	System.out.println(h.contains("WELCOME"));
	
	System.out.println(h.isEmpty());
	
	
	//reading elements from hasset using for each
	
	for(Object dataObject : h) {
		System.out.println( dataObject );
	}
	
	Iterator it = h.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	HashSet<Integer> num = new  HashSet<Integer>();
	num.add(10);
	num.add(20);
	num.add(70);
	num.add(200);
	HashSet<Integer> num1 = new HashSet<Integer>();
	num1.addAll(num);
	num1.add(90);
	num1.add(80);
	
	System.out.println( num1);
	
	
	//removeAll()
	num1.removeAll(num);
	System.out.println(num1);
	
	
	
	
	
	
	}

}
