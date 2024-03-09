package learning_dhanya;

import java.lang.invoke.VarHandle;

public class ParseANDvalueof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Java Wrapper Classes
//		Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//
//		The table below shows the primitive type and the equivalent wrapper class:
//
//		Primitive Data Type 	Wrapper Class
//		byte	                 Byte
//		short	                 Short
//		int                   	Integer
//		long                    	Long
//		float	                    Float
//		double	                    Double
//		boolean	                   Boolean
//		char	                    Character
		
		var first = Boolean.parseBoolean("true");
		System.out.println(first);
		
		var second = Boolean.valueOf("true");
		System.out.println(second);
				
		Integer.parseInt("1");			
		Integer.valueOf("1");		
		Long.parseLong("1");
		Long.valueOf("1");
			
	//parse method return primitve type
		//value of method return wrapper type
		
		
	//parseint convertParseint String to primitive int	
	//integer.toString produces a String Object	
		
		
		
	//	String valueOf() method is present in String class of java. lang package. valueOf() in Java is used to convert any non String variable or Object such as int, double, char, and others to a newly created String object.
//		The method parseInt() belongs to the Integer class which is under java. lang package. It is used to parse the string value as a signed decimal value. It is used in Java for converting a string value to an integer by using the method parseInt().
	}

}
