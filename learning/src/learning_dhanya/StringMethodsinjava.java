package learning_dhanya;

import java.security.AccessControlContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;

public class StringMethodsinjava {
	public static void main(String[] args) {
		// string is word wrapped in double quotes"
//    	String name = "Billi bob job";

//		System.out.println("Nname:" + name);
//		System.out.println("capitial:"+name.toUpperCase());
//		System.out.println(name.toLowerCase("small letter"));		
//		System.out.println("First Char:"+name.charAt(0));
//		System.out.println("Length:"+ name.length());
//		System.out.println("Lastindex:" +name.charAt(12));
//		System.out.println("Lastindex:"+ name.substring(10, 13)); //job  is output
//        System.out.println(name.substring(11)); //return ob
//    	int data = name.indexOf("b");
//	System.out.println(data); //index of b is 6 here
//		 String s4 = "Learn Share Learn";
//		System.out.println("Index of a  = " + s4.indexOf('a',3)); //after index 3,a comes first in index 8 so output 8

//       System.out.println("Check whether String is empty:"+ name.isEmpty());     //Checking whether string is empty or not
//   
		// trim extra space
//		String data =" dhanya ";
//	    System.out.println(data.trim()); 

		// convert number to a string

//		int num = 123456;
//		String s = String.valueOf(num);
//		System.out.println(s);
//
		// Equaltoignore case remove if its case sensitive.

//		String name = "bro";
//		boolean result = name.equalsIgnoreCase("Bro"); 
//		System.out.println(result); //output is true.

//		replace character
//  	String data = "how aoe u";
//  	String result = data.replace("o", "u"); 
//   	System.out.println(result);
//    	
//    	  String s1 = "Geeks";
//          String s2 = "forGeeks";
//          
//          System.out.println(s1.concat(s2));

//    	String s1 = "geekofgeeks";
//    	String s2 = "geek";
//    	
//    	System.out.println(s1.contains(s2)); //contains
//    	
		// string split

// 	String dataString ="Hello how are you";
// String[] splitedStrings =  dataString.split(" ");
// System.out.println("result=");
// for(String ele :splitedStrings ) {
// System.out.print(ele +" ," );
//    	

//    	//charArray
//    	
//    	String st = "abcdefghijklmnopqrstvwxyz";
//    	char[] charArray = st.toCharArray();
//    	for(char c : charArray ) {
//    		System.out.println( c );
//    		
//    	}
//    	
//    	

//    	
//		String aString = "dhanya";
//		String bString = "dhanya";
//		String cString = new String("dhanya");
//		String dString = new String("dhanya");
//
//		System.out.println(aString == bString); // here value is created once in the memory referene is pointing to same
//												// object-->true
//
//		System.out.println(aString.equals(bString)); // equls check the value -->true
//		System.out.println(cString == dString);//  here two different object is created in memory with different value.//false
//
//         System.out.println(aString==cString);
//
//        System.out.println(aString.equals(cString));

		// primitive values are checking the actual value not the momeory location

		// primitive variable represent that value itself not refrence to it
		/// use double equals wen u r comparing two primitive datatype
//        int a = 10;
//        int b = 10;

		//

//		

		// how to remove dollar sign

//		String price1 ="$9,9999.90";
//		System.out.println(price1.replaceAll("[$,]", ""));

//		how to remove dollar special character
//    	
//    	String dataString = "myMY%$^#$&124985";
//    	System.out.println(dataString.replaceAll("[^0-9 a-z A-Z]", "") );

//		
//	string array to string
//   	
//   	String[] arr = {"t","r","v"};
//   	String join = String.join("", arr);
//   	System.out.println(join);

//(String ...) is an array of parameters of type String
//where as String[] is a single parameter.
//Now here String[] can full fill the same purpose here but (String ...) provides more readability and easiness to use.
//It also provides an option that we can pass multiple array of String rather than a single one using String[].

		
		
		      
		}
	
//		for (String List : sortededList) {
//			
//			System.out.println(List.toUpperCase());
//			
			
			

		
	
}
