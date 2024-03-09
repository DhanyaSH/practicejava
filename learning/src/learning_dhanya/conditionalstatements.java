package learning_dhanya;

import java.util.Scanner;



public class conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if (false)
//			System.out.println("inside the if statement");
//
//		System.out.println("outside if statement");

		
		
//	if(false) {
//		if (false)
//			System.out.println("inside the if statement");
//            System.out.println("inside if statement");
//		
//	}
//		
//	System.out.println("outside if statement");
//	
		
		
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
	int num;
	Scanner sc= new Scanner(System.in);	
	System.out.println("Enetr first number:");
	num= sc.nextInt();
	String s = String.valueOf(num);
	if(num>999 && num<10000) {
		if(s.charAt(0)+s.charAt(1)== s.charAt(2)+s.charAt(3)) 
			System.out.println(num+"its lucky number");
	
		else 
				System.out.println(num+ "not lucky number");
			}
	else 
		System.out.println(num+"not valid 4-digit no");
	
		}
		
		
		
		
		
		
		
		
		
//		
//		
	}


