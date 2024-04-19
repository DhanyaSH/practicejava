package learning_dhanya;

public class Printinnumbersinascendingorder {

	

//For example: Let a =1, b= 5, c= 2. Output = 1,2,5
	public static void main(String[] args) {
		
		
int a = 1,b =5,c=2;
int max,secondmax,low ;

if(a>b) {
	max=a;
  secondmax=b;
} else {
	max=b;
	secondmax=a;	
}
	if(c>max)	{
	
	  low = secondmax;
	  secondmax = max ;
		max= c;
		
	}
	if(c>secondmax) {
		low = secondmax;
		secondmax =c;
	}else {
		low =c;
	}
	
	
	System.out.println("Ascending order is :"+low+","+secondmax+","+max);
	
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	

