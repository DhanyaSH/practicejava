package learning_dhanya;

import java.util.HashMap;

public class OccuranceoFeachword {

	
		
	public static void getcharcount(String name) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char StrArray [] = name.toCharArray();
		for (char c :StrArray  ) {
			if(!String.valueOf(c).isBlank()){
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				
			}else {
				charMap.put(c, 1);
			
		}
			}
		}
		System.out.println(name +" : "+ charMap  );

	
		}

	
		public static void main(String[] args) {		
			
		getcharcount(" test");
	}
	
}