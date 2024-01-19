package learning_array;

public class Operators_pavan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
	
//Arithmetic operator --> = - * / %
		
	System.out.println("Sum of numbers:" +( a+b));	
	System.out.println("Diff of numbers:" +(b-a));
	System.out.println("Mul of numbers:" +( a*b));
	System.out.println("Div of numbers:" +( b/a)); //quotient
	System.out.println("Mod of numbers:" +( a%b)); //reminder
	
	
	
//relational operator always return a boolean value
//	== < > <= >= !=
//these statements are used in conditional statements	
	
	System.out.println(a==b);//comparison operator,a=10 -->here = is an assignment operator
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);//a should be either less than b,or a should be equal to b,then it returns true.
	System.out.println(a>=b);//a should be either greater than b,or a should be equal to b
	System.out.println(a!=b);//a not equal to b
	
	
//	logical operators && || !
// works with two boolean values,
	
	boolean x = true;
	boolean y = false;
	System.out.println(x && y);//false
	System.out.println(x || y); //true
	System.out.println(!x);//false
	System.out.println(!y);//true
	
	
	//increment operator
	a=10;
	a++; //a=a+1;
	System.out.println(a);
	
	//decrement operator
	
	b= 20;
	b--; //b==b-1;
	System.out.println(b);
	
	
		
		
		
	}

}
