package learning_dhanya;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrays {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// print alternate
//		int srr[] = {1,2,3,4,5,6,2,3,4,5};  
//		for (int index =0; index < srr.length; index+=2) {
//			System.out.println(srr[index]);
//			

		// arrays equal or not if same order

//		int[] arr = {10,30,10,40};
//		int[] arr1 = { 10,30,10,40};
//
//		boolean isEqual = true;
//		if (arr.length == arr1.length) {
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] != arr1[i]) {
//					break;
//				}
//			}
//		}
//
//		else {
//
//			isEqual = false;
//		}
//		if (isEqual) {
//			System.out.println("array are equal");
//		}
//		else {
//			System.out.println("array are not equal");
//	}
//
//}
//}
/////////////////////////////////////////

//Arrays equal or not

//
//String[]s1  = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
//String[]s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp","hjhga"};
//if(s1.length != s2.length) {
//
//
//java.util.Arrays.sort(s1);til.A
//java.util.Arrays.sort(s2);
//
//
//System.out.println(java.urrays.equals(s1, s2));
//
//}

//duplicate in an array

//int arr[] ={1,2,3,4,4,6,5,7,8,1};
//System.out.println(Array.getLength(arr));//length is for array.size is for arraylist.
//System.out.println(arr.length);

//for (int i=0;i<arr.length;i++)
//
//for(int j=i+1;j<arr.length;j++)
//
//if(arr[i]==arr[j]){

//System.out.println(arr[i]);

		// duplicate element in an array

//		String arr[] = { "java", "javascript", "phython", "java" };
//		int arr[] = {1,2,3,4,5,6,1};
//
//		Set<Integer> elementSet = new HashSet<Integer>();
//		for(Integer ele:arr) {
//		if(elementSet.add(ele)== false) {
//			
//			System.out.println("duplicate element is ::"+ele);
//			

		// find maximum in a array

//		int count = 0;
//
//		int arr[] = { 2, 3, 8, 4, 5, 6, 7, 8 };
//
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++)
//			if (arr[i] > max) {
//
//				max = arr[i];
//				count++;
//			}
//
//		System.out.println("max in array" + max + "count" + count);

//fins the second max

//		    int count = 0;
//			int arr[] = { 2, 3, 8, 4, 5, 6, 7, 8 };
//		
//				int max = arr[0];
//				int secondmax = -1;
//	
//				for (int i = 1; i < arr.length; i++)
//					if (arr[i] > max) {
//				       max = arr[i];
//					}
//				 for (int i = 1; i < arr.length; i++)
//				  if (arr[i]>secondmax && arr[i]!= max) {
//					  secondmax = arr[i];
//			}
//		
//			System.out.println("max in array"+ max +"second max in array"+ secondmax );
//
//		

		// find common in two array

//	int arr[] = {10,20,30,40,50};

//array compare	

//		
//		class MyObj{
//		
//			int value;
//			String name ;
//		}
//		
//		MyObj mo[] = new MyObj[2];
//		MyObj mo2[] = new MyObj[2];
//		
//		mo[0] = new MyObj();
//		mo[0].name = "john";
//		mo[0].value = 6;
//	    
//		mo2[0] = new MyObj();
//		mo2[0].name = "john";
//		mo2[0].value = 1;
//		System.out.println(mo[0].name.equalsIgnoreCase(mo2[0].name));
// System.out.println(mo.length);	
// System.out.println(mo2.length);
//for (int i =0; i<mo.length;i++) {	
//System.out.println(mo[0].name.equals(mo[1]));
///System.out.println("name" +" "+mo[i].name +" "+ "value" +" "+ mo[i].value);

//}

//	/Object Array 

// class MyObj{
//
//     int value;
//     String name ;
// }
//
// MyObj mo[] = new MyObj[2];
// mo[0] = new MyObj();
// mo[0].name = "john";
//
// mo[1] = new MyObj();
// mo[1].name = "rema";
// mo[1].value = 1;
// System.out.println(mo.length);
//
//for (int i =0; i<mo.length;i++) {
//
//
//System.out.println("name" +" "+mo[i].name +" "+ "value" +" "+ mo[i].value);

//	}

		// missing 1 number in a array

//	int [] num = {1,2,3,4,6,7};
//	int n1 = findmissingnumber(num,7);
//	System.out.println(n1 );
//	
//}
//	public static int findmissingnumber(int [] num ,int count) {
//		
//		int expnumber = count*((count+1))/2;
//		
//		int actsum = 0;
//		
//		for(int value : num) {
//			actsum += value;
//		}
//			return expnumber-actsum ;
//			
//			

////		Finding Common Elements in Arrays:

//			
//			4. Write Java Program for following Input and Expected Output.
//			Input String = "aaaabbbccpppxxxx"
//			Expected Output: a4b3c2p3x4
//			
//			
		// find the largest and smallest in n array

//       int count = 0;
//		int arr[] = {17,5,6,8,97,9,7};
//	
//		int max=arr[0];
//		
//		for (int i=0;i<arr.length;i++)	{
//			if(arr[i]>max) {
//				
//				max= arr[i];
//				count++;
//			}			}	
//		System.out.println("max in arry"+max+"count"+count);	
//           int smallest	 = arr[0];
//           
//           for(int i =0;i<arr.length;i++) {
//            if(arr[i]<smallest) {
//	
//	smallest = arr[i];
//	count++;
//}
//           }
//           System.out.println("smallestin array"+smallest);

		// cmmon elements in 2 arrays
		int arr[] = { 4,3,7,9,2,4};
		int brr[] = { 5,1,4,8,3,5};
		int vrr[] = { 1,3,4,8,7,5};
java.util.Arrays.sort( arr);
java.util.Arrays.sort( brr);
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> set3 = new HashSet<>();
		HashSet<Integer> set4 = new HashSet<>();
		for (int firstarray : arr) {
			set1.add(firstarray);
		}
		
		for(int secndarray : brr) {
			set2.add(secndarray);
		}

		for(int thirdarray : vrr) {
			set3.add(thirdarray);
		}
		for(int data : set2) {
		boolean b =	set1.add(data);
		
		if (b== false) {
		set4.add(data);
		}
	
		for(int lastdata : set3) {
			boolean v = set4.add(lastdata );
			if (v == false) {
				System.out.println(lastdata );
			}
			
		}
		}
		
	
	}}

	

