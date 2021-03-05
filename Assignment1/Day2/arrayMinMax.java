package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMinMax {

	public static void main(String[] args) {
		// * 4)Take an array input and find the max value and min value from that array.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Here we go again! Pick a number between 1 - 10");
		int number = sc.nextInt();
		int boxbox[] = new int [number];
		
		System.out.println("Please sir! Can I have more numbers?");
		for (int i = 0; i < boxbox.length; i++) {
			boxbox[i] = sc.nextInt();
			
		}
		System.out.println("Forgot what your numbers are? Dont worry here they are!" + " \n" + Arrays.toString(boxbox));
		
		System.out.println("Now let see out of these numbers... which one is the min and which one is max");
		int min = boxbox[0];
		int max = boxbox[0];
		for (int i = 0; i < boxbox.length; i++) {
			if (boxbox[i] < min){
				min = boxbox[i];
			}if (boxbox[i] > max) {
				max = boxbox[i];			}
		}
		
		System.out.println("I am the smallest one! " + min);
		System.out.println("I am BIG! " + max);

	}

}
