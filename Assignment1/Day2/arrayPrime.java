package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPrime {

	public static void main(String[] args) {
	/// * 1)Take an array input and find all the prime numbers from it.
		Scanner sc=new Scanner(System.in);
		
		// retrieving the maximum number of the range from the input
		int range = sc.nextInt();
		
		//int box[]= {range};//This is wrong because it just adding the input as an element
		
		// the array and the size of the array is now defined
		int box[] = new int[range];
		
		// now lets add elements to this array using inputs
		for (int i = 0; i < box.length; i++) {
			box[i]= sc.nextInt();
			
		}
		//sorting the array
		Arrays.sort(box);
		//printing the array
		System.out.println(Arrays.toString(box));
		
		//printing out the prime numbers
		for (int x = 0; x < box.length; x++) {
			if(prime(box[x])==true) {
				System.out.println(box[x]);
			}
			
		}
		

	}
	//prime method
	public static boolean prime(int p) {
		//// body
		int count = 0;
		for (int i = 1; i <=p; i++) {
			if(p%i==0) {
				count++;
			}
			
		}
		if (count == 2) {
		return true;
	}else {
		return false;
	}
	
	}
}

