package learning_dhanya;

public class Reverseanditerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.how will you reverse a string and itterate it to 5 times
		
		String str  ="Dhanya";
		String rev = "";
		
		for (int i=str.length()-1; i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		 for (int i=0;i<=5 ;i++) {
			 System.out.println(rev);
	
	}

}}
