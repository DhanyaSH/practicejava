package learning_dhanya;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Dhanya";
		String revString = "";
		
		for (int i = name.length() -1;i>=0;i--) {
			
			revString = revString + name.charAt(i);
			
		}
		
		
		
System.out.println(revString);	
		
		
	}

}

//or


//String s = "123456789";
//StringBuilder x = new StringBuilder(s);
//x.reverse();
//String output = x.toString();
//
//System.out.println(output);