package learning_dhanya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare array list
		ArrayList al = new ArrayList();
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		ArrayList<String>al2 = new ArrayList<String>();
//	    List al4 = new ArrayList();
//		

//		ADD ELEMENT TO ARRAY LIST

	    al.add(100);
//		al.add("WELCOME");
//		al.add(10.5);
//		al.add('A');
//    	al.add(true);
		System.out.println(al);
//		System.out.println(al.get(3));

		// size -->how many elements stored in arraylist
//		System.out.println("Number of elements in array list:" + al.size());

		// remove
//		System.out.println(al.remove(1)); //pass index or element
//		System.out.println(al.remove("welcome")); //pass index or element
//		System.out.println("Number of elements after removing:" + al);
//		

		// insert a new element specifying index
//		
//		al.add(2,"Hello");
//		System.out.println("After inserting new elemt:" + al);
//		
//		//retrive specific element
//		System.out.println(al.get(2)); // get elements of second index from the array.
//		
//		//change element or replace element from arraylist
//		
//		
//	    al.set(3, "miya");
//	    System.out.println("After REPLACING EXITING WITH NEW elemt:" + al);
//	    
//	    
//	    //search -contains
//	  System.out.println(al.contains("miya"));
//	  
//	  //isEmpty
//	  System.out.println(al.isEmpty());
//	    
//	

//	  we can read data using 
//	  1 for loop
//	  2 for each ..al.loop
//	  3 iterator

//	  1 for loop	
//	  
//	  for(int i=0; i<al.size();i++)
//	  {
//		  System.out.print(al.get(i) +" ");    
//		}
//	for each loop

//		for(Object i : al)
//		{
//	
//	System.out.println(i + " ");
//	
//	
//	
//	iterator

//	Iterator it = al.iterator();
//	while(it.hasNext())
//	{
//	System.out.println(it.next());//printing element ad moving to next element.
//		}

		// treams with lambda

//	al.stream().forEach(ele ->System.out.println(ele));

//add all and remove all
//		
//ArrayList lan = new ArrayList();
//lan.add("raya");
//lan.add("memya");
//lan.add("ama");
//lan.add("epple");
//
//ArrayList lan1 = new ArrayList();
//lan1.addAll(lan);
//
//lan1.removeAll(lan);
//
//System.out.println(lan1);

//sort -----collections.sort() 

//		System.out.println("elements before sorting:"+ lan);
//		Collections.sort(lan); //sorted
//		System.out.println("elements after sorting:"+lan);
//	Collections.sort(lan,Collections.reverseOrder()); ///sort in the reverse order
//	                           
//	System.out.println("elements in reverse order:"+lan);	
//	
//	Collections.shuffle(lan);
//	System.out.println("elements in shuffle order:"+lan);

//convert array into arraylist
//		String arr[]= {"happy","positive","money","love"};
//		
//		for (String value: arr) {

//		System.out.println(value);

//	}

//	     ArrayList al = new    ArrayList(Arrays.asList(arr));
//	    Iterator value = al.iterator();
//	    boolean status = false;
//	    while(value.hasNext()) {
//	    Object dataObject =   value.next();
//	    if(dataObject.equals("honey")) 
//	    {
//	    status = true;
//	    
//	    break;
//	    
//	    }    else {
//	    	
//	    	status = false;
//	    }
//	    	 
//	    }
//	    
//	  System.out.println(status); 
//	    }
//	    	
//	    	
//	    	
//	  
//	  
//		// convert arraylist to array
//		ArrayList<Object> al1 = new ArrayList<Object>();
//
//		al1.add(100);
//		al1.add("WELCOME");
//		al1.add(10.5);
//		al1.add('A');
//		al1.add(true);
//	
//	Object[] itemObjects = al1.toArray(new Object[al1.size()]);
//	System.out.println(Arrays.toString(itemObjects));
//
//	
////	convert array to arraylist
//	List<Object>l2 = new ArrayList<>();  
//	l2=	Arrays.asList(itemObjects);
//	
//	System.out.println(l2);

		// add all
//
//		ArrayList<String> al1 = new ArrayList<String>();

//		al1.add("java");
//		al1.add("WELCOME");
//		al1.add("ruby");
//		al1.add("A");
//		al1.add("light");

//		ArrayList<String> al2 = new ArrayList<String>();

//		al2.add("100");
//		al2.add("liya");

//		al1.addAll(al2);
//		al1.addAll(0, al2);

//		System.out.println(al1);
//		al1.clear();
//
//		System.out.println(al1);
		
		//clone
//		ArrayList<String> cloneList =(ArrayList<String>)al1.clone();
//		System.out.println(cloneList);
		
		
//		indexOf
//		System.out.println(al1.indexOf("WELCOME")>0);
		
		//lastindexof
		
//		System.out.println(al1.lastIndexOf("light"));
		
		
		//given a list and remove all the even number from list
		
//		ArrayList<Integer> numbersodd = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbersodd.removeIf(num->num%2==0);
//		System.out.println(numbersodd);
		
		
//		ArrayList<Integer> numberseven = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numberseven.removeIf(num->num%2!=0);
//		System.out.println(numberseven);
		
		
//		retainALL // give only diya
//		ArrayList<String> nameArrayList = new ArrayList<String>(Arrays.asList("diya","dhanya","diya","tom"));
//		nameArrayList.retainAll(Collections.singleton("diya"));
//		System.out.println( nameArrayList);
		
//		//subLIST
//		ArrayList<Integer> nameArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		ArrayList<Integer> sublist = new ArrayList<Integer>(nameArrayList.subList(2, 6));
//		System.out.println(sublist);
		
		
		
//		Normally, we will think about Arrays.asList() method to convert int[] to List<Integer>. But this doesn’t solve our issue because asList() method will return List<int[]>.
		
//		 int[] rawData = {1, 3, 5};
//		 List<Integer> data = Arrays.stream(rawData)     // IntStream
//		                         .boxed()             // Stream<Integer>
//		                         .collect(Collectors.toList());
		
		
		// Sort list of Strings in alphabetic order using java 8
//				List<String> sortededList = Arrays.asList("banana", "Apple", "Mango","banana");
//				sortededList.replaceAll(String::toUpperCase);			
//	                     Collections.sort(sortededList);	                     
//	                     System.out.println(sortededList );
	                     

//	             		List<String> sortededListusiList =	 sortededList.stream().sorted().collect(Collectors.toList());
//	             	System.out.println(sortededListusiList);
//	             		
//	             		

	}
}
