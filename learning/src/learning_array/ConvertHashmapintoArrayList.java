package learning_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertHashmapintoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Google", 10000);
		map1.put("Walmart", 20000);
		map1.put("Amazon", 30000);
		map1.put("Cisco", 15000);
		System.out.println("size of map:" + map1.size());
		Iterator<Entry<String, Integer>> it = map1.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> ele = it.next();
//		Map.Entry pairsEntry = it.next();
			System.out.println(ele.getKey() + "=" + ele.getValue());
			
			
		}
			
//stream to print
		
		map1.forEach((k,v)->System.out.println("key ="+k +"value="+v));
		
		
		
		
			// convert hashmap key into arraylist

			ArrayList<String> keys = new ArrayList<String>(map1.keySet());
            System.out.println("keys count ::"+ keys.size() );
			for (String mapkey : keys) {
				System.out.println(mapkey);

			}

			// convert hashmap value into arraylist
			
			ArrayList<Integer> values = new ArrayList<Integer>(map1.values());
			System.out.println("value count ::"+ values.size() );
			for (Integer valuesinmap :values ) {
				System.out.println(valuesinmap);
			
			
			
		}

	}

}
