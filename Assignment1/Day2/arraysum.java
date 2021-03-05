package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the first number that comes to mind?");
		int favorite = sc.nextInt();
		int container[] = new int [favorite];
		
		
		System.out.println("Now give me some of your favorite numbers");
		for (int i = 0; i < container.length; i++) {
			container[i] = sc.nextInt();
		
		}
		
		System.out.println("Here is an array of your favorite numbers");
		System.out.println(Arrays.toString(container));
		
		
		int totaleven = 0;
		for (int i = 0; i < container.length; i++) {
			if (container[i] % 2 == 0){
				totaleven += container[i];
			}
			
		}
		
		System.out.println("This is the sum of your favorite even number: " + totaleven);
		
		
		

	}

}
