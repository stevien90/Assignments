package Day3;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
// * 1)Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
		Scanner sc = new Scanner(System.in);
		System.out.println("I neeeeeeeeed random numbers and characters... PLEASEE");
		String userInput = sc.next();
		System.out.println("Just checking.. is this what you really wrote? o.o : " + userInput);
		
		
		System.out.println("Here all the vowels in your input: ");
		int count = 0;
		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' ||
				userInput.charAt(i) == 'u' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'A' || 
				userInput.charAt(i) == 'I' || userInput.charAt(i) == 'O' || userInput.charAt(i) == 'U' ||
				userInput.charAt(i) == 'E') {
				count++;
			}
			
		}
		System.out.println(count);
	
	//Here is the easy way with RegEx
		System.out.println(userInput.replaceAll("[^aieouAIEOU]","").length());
	}
	

}
