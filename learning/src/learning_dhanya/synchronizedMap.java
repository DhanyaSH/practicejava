package learning_dhanya;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class synchronizedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//synchronized method in collection class:
	Map<String, String> map1 = new HashMap<String,String>();
	map1.put("1", "Naveen");
	map1.put("2", "Naveen");
	map1.put("3", "Naveen");
	
	//create synchronizedMap:
	
	Map<String, String> syncMap = Collections.synchronizedMap(map1);
	System.out.println(syncMap);
	
	
	
	//concurrentMap:it does not throw any ConcurrentModificationEception
	
	ConcurrentHashMap<String, String> concurrentHashMap = new 	ConcurrentHashMap<>();
	
		
		
	concurrentHashMap .put("1", "Naveen");
	concurrentHashMap .put("2", "Naveen");
	concurrentHashMap .put("3", "Naveen");
		
	System.out.println(concurrentHashMap.get("1"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
