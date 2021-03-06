package Day3;
import Day2.arrayPrime;

import java.util.Arrays;
import java.util.Scanner;

public class primeupper {

	public static void main(String[] args) {
		//  * 3)Take a string input and print the characters at prime index to uppercase.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ahhh BRAIN OVERLOADING");
		
		String x = sc.nextLine();
		int number = x.length();
		
		for (int ss = 2; ss < number; ss++) {
			if(arrayPrime.prime(ss)) {
				System.out.println(x.toUpperCase().charAt(ss));
			}
			
		}
		
		
		

		
}
}