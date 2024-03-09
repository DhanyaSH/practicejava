package learning_dhanya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class compareHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//On the basis of key-value: use equals method:
HashMap<Integer,String> hash = new HashMap<Integer,String>();
hash.put(1,"A");
hash.put(2,"B");
hash.put(3,"C");


HashMap<Integer,String> hash2 = new HashMap<Integer,String>();
hash2.put(1,"A");
hash2.put(2,"B");
hash2.put(3,"C");

HashMap<Integer,String> hash3 = new HashMap<Integer,String>();
hash3.put(1,"A");
hash3.put(2,"B");
hash3.put(3,"C");
hash3.put(3,"C");


HashMap<Integer,String> hash4 = new HashMap<Integer,String>();
hash4.put(1,"A");
hash4.put(2,"B");
hash4.put(3,"C");
hash4.put(3,"D");

//boolean result  = hash.equals(hash2);
//System.out.println(result);

//System.out.println(hash2.equals(hash3)); //its takes the latest one (3,"c")
//System.out.println(hash3.equals(hash4)); //its takes the latest one (3,"D")



//compare hashmaps  for the same keys

//System.out.println(hash.keySet().equals(hash2.keySet()));
//System.out.println(hash2.keySet().equals(hash4.keySet()));
//



//findout the extra keys in the hashmap by combining hashmap
//
//HashMap<Integer,String> map1 = new HashMap<Integer,String>();
//map1.put(1,"A");
//map1.put(2,"B");
//map1.put(3,"C");
//
//HashMap<Integer,String> map2 = new HashMap<Integer,String>();
//map2.put(1,"A");
//map2.put(2,"B");
//map2.put(3,"C");
//map2.put(4,"D");

//combine the keys from both hashmap:using hashset
//
//HashSet<Integer> set = new HashSet<Integer>(map1.keySet()); //map1 add keyset to set
////add the keyset from mp4:
//set.addAll( map2.keySet());
//set.removeAll(map1.keySet());
//System.out.println(set);

//COMPARE MAPS BY VALUES
HashMap<Integer,String> map1 = new HashMap<Integer,String>();
map1.put(1,"A");
map1.put(2,"B");
map1.put(3,"C");

HashMap<Integer,String> map2 = new HashMap<Integer,String>();
map2.put(4,"A");
map2.put(5,"B");
map2.put(6,"C");
HashMap<Integer,String> map3 = new HashMap<Integer,String>();
map3.put(1,"A");
map3.put(2,"B");
map3.put(3,"C");
map3.put(4,"C");




//COMPARE MAPS BY VALUES WHEN DUPLICATES ALLOWED USING ARRAYLIST

//System.out.println( new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
//
//System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));
//


//COMPARE MAPS BY VALUES WHEN DUPLICATES  ARE NOT ALLOWED
//System.out.println( new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
//System.out.println( new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));







	}

}
