package learning_dhanya;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//	String x[][] = new String [3][5];
//	int c[][] = {{2,3,4},{4,5,6}};
//		   //
//		
////		
//		System.out.println(x.length); //total rows
////		
//	System.out.println(x[0].length); //total columns
//		
//		x[0][0] = "A";
//		x[0][1] = "B";
//		x[0][2] = "C";
//		x[0][3] = "D";
//		x[0][4] = "D";
//
//		x[1][0] ="A1";
//		x[1][1] = "B2";
//		x[1][2] = "C3";
//		x[1][3] = "D4";
//		x[1][4] = "D4";
//		
//		x[2][0] ="A2";
//		x[2][1] = "B2";
//		x[2][2] = "C3";
//		x[2][3] = "D5";
//		x[2][4] = "D5";
////		
//		
//		for(int row = 0 ;row <x.length; row++)
//			for(int column =0 ; column <x[0].length; column++ ) {
//				System.out.println(x[row][column]);
//		for (String[]  data: x)
//		for(String s : data ) {
//			System.out.print( s +" ");
//		
//		
//				
//			}
//		
//		System.out.println();
//		
//
//		

//		int b[][] = {{2,4,5},{3,4,5},{5,2,6}};
////		System.out.println(b[0][1]);
//		
//		for(int i = 0;i<3;i++) { //row
//			
//			for(int j = 0;j<3;j++) { //column
//				System.out.println(b[i][j]);
//					
//				
//			}
//		}

		// find the min in 3*3 array

//	 int abc[][] = {{2,4,5},{3,4,5},{5,2,6}};
////		
//      int minimun= abc[0][0] ;
//		
//		for(int i =0;i<3;i++) {
//	for(int j=0;j<3;j++) {
//		if(abc[i][j]<minimun) {
//			
//		minimun = abc[i][j];
//		
//		}
//		
//	}
//		}
//		
//	System.out.println(minimun);	
//		
//		

		// max

//	int abc1[][] = {{2,4,5},{3,4,5},{5,2,9}};
////	
//  int max= abc1[0][0] ;
//	
//	for(int i =0;i<3;i++) {
//for(int j=0;j<3;j++) {
//	if(abc1[i][j]>max) {
//		
//	max = abc1[i][j];
//	
//	}
//	
//}
//	}
//	
//System.out.println(max);	
//	
//	
//	
//	

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 5 }, { 5, 2, 6 } };

		int minimun = abc[0][0];
		int minimumcolumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < minimun) {

					minimun = abc[i][j];
					minimumcolumn = j;

				}

			}
		}
		int max = abc[0][minimumcolumn];
		int k = 0;		
		while (k < 3) {
			if (abc[k][minimumcolumn] > max) {
				max = abc[k][minimumcolumn];
			}
			k++;
		}

		System.out.println(max);

	}

}
