package Day2;

import Day1.Palindrome;
import java.util.Arrays;
import java.util.Scanner;

public class arraypali {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("How big do you want it? ^.^");
		int length = sc.nextInt();
		
		//Declaring array bo to have the length of the input
		int bo[]= new int [length];
		
		//Now assign elements to this new array with inputs
		
		for (int i = 0; i < bo.length; i++) {
			bo[i]= sc.nextInt();
	
			
		}
		
		//Sort it the elements
		Arrays.sort(bo);
		//Check to see if everything is working with a print
		System.out.println(Arrays.toString(bo));
		
		//Let see which ones are palindrome using import
		for (int p = 0; p < bo.length; p++) {
			Palindrome.isPalindrome(bo[p]);
			//compared to the prime method... this palindrome already has two methods that does if statements to 
			//check if it true and it prints out the results
			
			
		}

	}

}
