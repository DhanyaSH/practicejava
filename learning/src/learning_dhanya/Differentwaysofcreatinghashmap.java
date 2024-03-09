package learning_dhanya;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Differentwaysofcreatinghashmap {

	public static HashMap<String, Integer> map3;

	static {

		map3 = new HashMap<>();
		map3.put("riya", 100);
		map3.put("das", 200);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Using hashmap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		

		// 2.Static hashmap
		Differentwaysofcreatinghashmap.map3.get("riya");
		
		

		// immutable map with only single entry

//		Map<String, Integer> immutablemap = Collections.singletonMap("diya", 200);
//		System.out.println(immutablemap.get("diya"));
//		immutablemap.put("liya", 300); ///java.lang.UnsupportedOperationException
//		
//		
		
		
		//jdk8
		
		//creating one 2D array of Strings using Stream and collecting in the form of map
		
//
//		Map<String,String> map = Stream.of(new String [][]{
//			
//			{"love","a"},
//			{"run","b"},
//			}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
//				
//				
//		
//System.out.println(map.get("love"));


//create empty map
	Map<String,String> emptyMap1 = Map.of();	
	emptyMap1.put("tom", "python");
	System.out.println(emptyMap1.get("tom") ); //UnsupportedOperationException
	
//singleton map:	
	Map<String,String> singletonmap = Map.of("k1","v1");	
	System.out.println(singletonmap.get("k1") ); //UnsupportedOperationException
	singletonmap.put("k", "j");////UnsupportedOperationException
	
//multi values map:max 10 pair can be stored:
	
	Map<String,String> multimap = Map.of("k1","v1","k2","u","k3","o");	
	System.out.println(multimap.get("k1") );////UnsupportedOperationException
	
	
	
	//ofEntries method :no limitations on pairs(key-value)
	//immutable maps:
	
	Map<String,Integer> map7 =Map.ofEntries(
	
			new AbstractMap.SimpleEntry<>("a",200),
			new AbstractMap.SimpleEntry<>("b",400),
			new AbstractMap.SimpleEntry<>("c",500)
			
			);
System.out.println(map7.get("c"));
map7.put("D", 400);//UnsupportedOperationException




}}