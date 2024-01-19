package learning_dhanya;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x[][] = new String [3][5];
		
//		
//		System.out.println(x.length); //total rows
//		
//		System.out.println(x[0].length); //total columns
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "D";

		x[1][0] ="A1";
		x[1][1] = "B2";
		x[1][2] = "C3";
		x[1][3] = "D4";
		x[1][4] = "D4";
		
		x[2][0] ="A2";
		x[2][1] = "B2";
		x[2][2] = "C3";
		x[2][3] = "D5";
		x[2][4] = "D5";
//		
//		
//		for(int row = 0 ;row <x.length; row++)
//			for(int column =0 ; column <x[0].length; column++ ) {
//				System.out.println(x[row][column]);
		for (String[]  data: x)
		for(String s : data ) {
			System.out.print( s +" ");
		
		
				
			}
		
		System.out.println();
		

	}

}
