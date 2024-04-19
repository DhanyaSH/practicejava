package learning_dhanya;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Plaindrome is a number that remains the same when digits are reversed
		
		 int num =121;
		 int rev = 0;
		 int originalNum = num;
		 while(num!= 0) {
			 rev = rev*10+num%10;
			 num=num/10;
			 }
 if(originalNum == rev) {
	System.out.println("Number is Plaindrome "); 
 }else {
	  System.out.println("Number is not Plaindrome"); 
	 
}
}
}
