package learning_dhanya;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListElementsToLowerCaseExample {

	public static void main(String[] args) {
	

	       List<String> list = new ArrayList<>();
	       
	        list.add("aBc");
	        list.add("DeF");
	        list.add("GHI");
	        list.add("abc");
	 
	        list.replaceAll(String::toLowerCase);
	 
	        System.out.println("LowerCase list " + list);
	 
	        list.replaceAll(String::toUpperCase);
	 
	        System.out.println();
	 
	        System.out.println("UpperCase list " + list);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
