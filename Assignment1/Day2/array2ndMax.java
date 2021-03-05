package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class array2ndMax {

	public static void main(String[] args) {
		//  * 5)Take an array input and find the 2nd max value in that array.
		
		//let try to do this all in one
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int box[] = new int [size];
		
		for (int i = 0; i < box.length; i++) {
			box[i] = sc.nextInt();	
		}
		
		
		System.out.println(Arrays.toString(box));
		
		int max = box[0];
		int secondMax = box[0];
		
		for (int i = 0; i < box.length; i++) {
			if (box[i] > max){
				max = box[i];
			}if (box[i] < max && box[i] >secondMax) {
				secondMax = box[i];
			}
			
		}
		
		System.out.println("I am bigger than the rest " + max);
		System.out.println(" I am almost just as big " + secondMax);

	}

}
