package learning_dhanya;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {10,56,89,76,56,90};

int len = arr.length;
int count = len/2;

if(len == 0 ||len == 1)
	return;

for (int i=0;i<count; i++ ) {
	
	int temp = arr[i]; 
	arr[i] = arr[len -1 -i];
	arr[len -1 -i] = temp;
}
System.out.println("After reversing array:" +java.util.Arrays.toString(arr) );

	}

}
