package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class vowels2 {

	public static void main(String[] args) {
		// * 2)Take a string input and print true if all vowels are present in it else print false. 
		//aHedafioullooo - true aHedafiollooo - false
	
		System.out.println("Oh Yeah! Here we go again! Provide me random characters and it better contain aieou");
		Scanner sc = new Scanner(System.in);
		String message = sc.next();
		System.out.println("This is what you wrote:\n" + message + "\nLet see if you follow my one simple rule");
		
		//String message2 = message.replaceAll("[^aieou]", ""); // tried for the longest time to figure out
		//how to make an easier way using regex
		
		//if(message2.contains("[aieou]{,}")) {
		//	System.out.println(true);
		//}else {
		//	System.out.println(false);
		//}
		
		if(message.contains("e") && message.contains("a") && message.contains("i")
				&& message.contains("o") && message.contains("u")){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
		
		
		
	}
}
