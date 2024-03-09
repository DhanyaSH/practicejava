package learning_dhanya;
	
//Base Class
class Complex {
 public  static void f1()
 {
     System.out.println(
         "f1 method of the Complex class is executed.");
 }
}

//class child extend Demo class
class Sample extends Complex {
	
 public static  void f1()
 {
		
     System.out.println(
         "f1 of the Sample class is executed.");
 }
}