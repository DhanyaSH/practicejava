package learning_dhanya;



public class TWO__darray {
	public static void main(String[] args) {
		
//		If the input is string like"my name is karthik" then the output should be m=2 a=2

		String data = "my naame is karthik";

      int totalcount = data.length();
      System.out.println(totalcount );
     int totallengthremovingA  = data.replace("a", "").length();
     System.out.println(totallengthremovingA);
     int totallengthremovingM = data.replace("m", "").length();
     int total = totalcount - totallengthremovingA;
     int total1 = totalcount - totallengthremovingM;
     System.out.println("totoal count of a:"+total+"totoal count of m:"+total1);
    
     
     
     
    
	
		

//int [][]arr = {{2,1,3},{4,5,6}};

//for (int r = 0; r<arr.length ;r++ ) {
//
//	for (int c =0; c<arr[r].length;c++) {
//		System.out.println(arr[r][c]);
//}
//System.out.println();
//}

//foreach

//for (int[] row :arr)
//	
//	for(int value :  row) {
//		
//		System.out.print(value+ "  ");	
//		
//	}
//System.out.println();

	



//	reverse an int array for the given numbers
		
//int [] arr = {10,20,30,40,50};
//for(int i =arr.length-1;i>=0;i-- ) {
//	
//	System.out.println(arr[i] + " ");
		
//reverse a string
		
		
		
		
		
		
		
		

 //factorial of a number
//	int factorial = 1;
//	int data = 3;
//	for(int i = 1; i<=data; i++ ) {
//		factorial =  factorial * i;
//	}
//		System.out.println(factorial);
//				
//	

	// array sorting without inbuild

	}


}

