package learning_dhanya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class hashmap {

	// no order -no indexing
	// stores values -- key-Value<k,v>
	// key cannot be duplicate
	// can store n number of null values but only one null key

	// haashmap is not thread-safe

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		HashMap<String, String> map = new HashMap<String,String>();
//		
//		map.put("India", "newDelhi");
//		map.put("delhi", "chalo");
//		map.put("kerala", "kannur");
//		map.put("america", "usa");
//		map.put("uk", "newplace");
//		
//		System.out.println(map.get("India"));
//		System.out.println(map.toString());
//		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("uk", "newplace");
		map.put("kerala", "kannur");
String data =	map.get("uk");
		System.out.println(data);
		
		
		
		
	}
		// key cannot be duplicate ,if there is duplicate key it will select the latest
		// key)

//	HashMap<String, String> map = new HashMap<String,String>();
//		
//		map.put("India", "newDelhi");
//		map.put("delhi", "chalo");
//		map.put("kerala", "kannur");
//		map.put("america", "usa");
//		map.put("uk", "newplace");
//		map.put("uk", "newplace1");
//		
//		
//	
//		System.out.println(map);

		// can store n number of null values but only one null key,if there is more than
		// 1 null key it will take the latest key
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("India", "newDelhi");
//		map.put("delhi", "chalo");
//		map.put("kerala", "kannur");
//		map.put("america", "usa");
//		map.put("null", "newplace");
//		map.put("null", "newplace1");
//		
//		
//
//		
//		System.out.println(map);
//		
//		
//		HashMap<String, String> map = new HashMap<String,String>();
//		
//		map.put("India", "newDelhi");
//		map.put("delhi", "chalo");
//		map.put("kerala", "kannur");
//		map.put("america", "usa");
//		map.put("uk", "newplace");
//		map.put("uk", "newplace1");
//		map.remove("uk");//remove
//		System.out.println(map); 
//		System.out.println(map.containsKey("India"));
//		System.out.println(map.containsValue("kannur"));
//		System.out.println(map.replace(america, "kerala"));
		
//		System.out.println(map.putIfAbsent("liya", "tagit"));
		
		
//		Iterator :over the keys:by using KeySet()

//	Iterator<String> keyIterator =	map.keySet().iterator();
//		while(keyIterator.hasNext()) {
//		String key =	keyIterator.next(); //gives key
//        String value = map.get(key);//gives value
//		System.out.println("key is="+key+"value is="+value);
//		}
//		
		// iterator:over the set(pair):by using entrySet
//Iterator<Entry<String, String>> it1	= map.entrySet().iterator();
////the entire set will be stored under hashmap using entryset class
//		while(it1.hasNext()) {
//	Entry<String, String> entry = it1.next();	
//	System.out.println("key ="+entry.getKey()+"value="+entry.getValue());
//	
		//

//		}
		
		
//		// iterate hashmap using java 8 for each and lambda:
//		map.forEach((k,v)-> {System.out.println("key= " +k+ "value= " +v);
//		});
		
		//is empty
//		
//		System.out.println(map.isEmpty());
//		System.out.println(map.size());
//		
//		
//		//KEY EXIT
//		if(map.containsKey("India")) {
//			System.out.println("Exist");
//		}else {
//			System.out.println("Dont Exist");
//			
//
//	}
//		//IF VALUE EXIT
//		
//		if(map.containsValue("chalo")) {
//			System.out.println("Exist");
//		}else {
//			System.out.println("Dont Exist");
//			
//		
			
		//get value	by key
//			
//	String	data =	map.get("India");
//	System.out.println(data);
//			
		
		
		
		//remove key from hashmap
		
//		map.remove("India");
//		System.out.println(map);
		
		
		//get all key from hashmap
//		
//Set<String>	keySet = map.keySet();
//System.out.println(keySet);


			//get all the  values
//Collection<String> values = map.values();
//System.out.println(values);


//foreach method
//
//for(Entry<String, String> entry:map.entrySet()) {
//System.out.println("key ->"+ entry.getKey()+" values ->"+entry.getValue());
////
////hashmap using java 8 forEach
//map.forEach((K, V) -> {
//System.out.println(" K " + K);
//System.out.println(" V " + V);
//});













		
}

