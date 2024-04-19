package learning_dhanya;

import java.util.HashSet;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s= "abrr de fgh ijkln mopqrst uvwxyz";
		String replacespace = s.replace(" ","");
		char[] charArrray = replacespace.toCharArray();
		HashSet<Character> set= new HashSet();
        for( char ele:charArrray  ) {
        	set.add(ele);
        }
		if ( set.size() == 26) {
		System.out.println("panagram");
	
		}else {
		System.out.println("notpanagram");

        }}}
    	
    	
    	
    	
    


