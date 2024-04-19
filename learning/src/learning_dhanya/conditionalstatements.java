package learning_dhanya;

import java.util.Scanner;




public class conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0;i<=20;i=i+5) {
//
//			if(i == 20) {
//			
//			System.out.println("i is 20 ");
//			
//			
//		}else {
//			
//			System.out.println( "i is  not 20" );
//		}
//			
//			
//			
//			
//		}
//			
//	
//	}}
		
		
		
//	//true code will get execute
//	if(true)
//		System.out.println("condition is true");

		
//	//false code will nnot get executes
//		if(false)
//			System.out.println("condition is false");
		
	
		
		//both code willget executed
		
//	if(true)
//		System.out.println("inside if statement");
//	System.out.println("outside if statement");
		
		
		
		//outside if is executed
		
//	if(false)
//		System.out.println("inside if statement is executed");
//		System.out.println("outside if statement is executed");
//		
	
		//all 3 code is executed
		
//	if(true)

//			System.out.println("inside the if statement");
//            System.out.println("inside if statement");
//		
//	}
//		
//	System.out.println("outside if statement");
	
		
		//only outside if statemet is executed
		
//		if(false)

//				System.out.println("inside the if statement");
//	            System.out.println("inside if statement");
//			
//		}
//			
//		System.out.println("outside if statement");
		
		
		
		
		
		
	//while loop
		//here body will stop executing when its i = 6
//		int i = 1;
		
//		while(i<=5) {
//			System.out.println("hello" + i);
//			i++;
//		}
		
		
		//infinite loop
//		int i = 1;
//		while(i<=5) {
//		System.out.println("hello" + i);
//		
//		}
	
		
		
		//while loop exercise
		
		
//		int num;
//		Scanner sc= new Scanner(System.in);	
//		System.out.println("Enetr a number between 1 amd 10:");
//	    num =  sc.nextInt();
//		while (num <1 || num> 10) {
//		System.out.print(num +"is not between 1 and 10 try again");
//		 num =  sc.nextInt();
//		}
//		System.out.println(num +"is between 1 and 10");
//		
//		
		
		//do while loop eercise
//	
//		Scanner sc= new Scanner(System.in);	 
//		int num;
//		do {
//			
//			System.out.println("Enter the number between  amd 10 :");
//		
//			   num =  sc.nextInt();
//		
//		}while(num<1 || num>10);
//		
//		System.out.println(num +"is between 1 and 10");
		
		
		
		
		//infinite
//		for(; ;)
//		System.out.println("none");
		
		
		
		
		
//		nested for loop
		
//		
//		for(int i =0;i<=5;i++) {
//			for(int j=0;j<=i;j++) 
//			
//			System.out.print("*");
//			
//			System.out.println();
//		}
//		
		
		//multiplication table
		
//		for(int i =1 ;i<=10;i++) {
//			for(int j =1;j<=10;j++)
//			System.out.print(i*j);
//			
//			System.out.println();
//			
//			
//			
//			
//		}
//		
		
	//continue and break
		
//		
//		for(int i = 1;i<=10;i++) {
//			if(i%2 == 0)
//				continue;
//			System.out.print(i+"");
//			
//			
//			
//		}
		
	
		
	
		Scanner sc= new Scanner(System.in);	
		int sum =0;
	       while(true) {
	     System.out.println("enter a num:");
	     sum +=sc.nextInt();
	     
	     if(sum>100)
	    	 break;
	       }
	       
	      System.out.println("Done" + sum); 
	       
	       
	}}
	
		
		
		
		///find max of two number
//		
//		int x = 10;
//		int y=10;
//		
//		if (x>y) {
//			System.out.println("x is greater");
//			
//		}else if (x<y) {
//			
//		     System.out.println("y is greater");
//		} else {
//				if(x==y) {
//					
//				System.out.println("x is equal to y");	
//					
//			}
//			
//		}
			
//		if else
		
//		if (true)
//			System.out.println("inside the if statement");
//		else 
//			System.out.println("inside else sttament");
//			
//			
//		System.out.println("Outside if .inand else");
//			
//			
//		}		
		
//	Nested if
//	int n =10;
//	if(n>10)
//		System.out.println(">10");
//	else if(n == 10)
//			System.out.println("=10");
//		else 
//			System.out.println("<10");
////			
//		}
//		
//			
//	int a;
//	Scanner sc= new Scanner(System.in);	
//	System.out.println("Enetr first number:");
//	a = sc.nextInt();
//		switch (a%2) {
//		case 0:
//		System.out.println("even");
//	   	break;
//		default:
//			System.out.println("odd");
		
		//calculator
		
//		int a,b,c,d;
//		Scanner sc= new Scanner(System.in);	
//	System.out.println("Enetr first number:");
//		a = sc.nextInt();
//		System.out.println("Enter second nuber :");
//		b = sc.nextInt();
//		System.out.println("1>Add 2->Sub 3->Div 4->Mod Enter your choice :Enter your choice:");
//		c = sc.nextInt();
//			switch(c) {
//			case 1:
//			System.out.println("Addition="+(a+b));
//			break;
//			case 2:
//			System.out.println("Subtraction=" +(a-b));
//			break;
//			case 3:
//			System.out.println("divide="+(a/b));
//			break;
//			case 4:
//			System.out.println("divide="+(a%b));
//			break;	
//			default:
//				System.out.println("not valid");
//				
//		
//			}}	
//		
		//a four digit number ABCD IS CALLED lucky number if A+B = C+D
//	int num;
//	Scanner sc= new Scanner(System.in);	
//	System.out.println("Enetr first number:");
//	num= sc.nextInt();
//	String s = String.valueOf(num);
//	if(num>999 && num<10000) {
//		if(s.charAt(0)+s.charAt(1)== s.charAt(2)+s.charAt(3)) 
//			System.out.println(num+"its lucky number");
//	
//		else 
//				System.out.println(num+ "not lucky number");
//			}
//	else 
//		System.out.println(num+"not valid 4-digit no");
//	
//		}
//		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	


