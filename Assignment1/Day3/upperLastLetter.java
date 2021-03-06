package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class upperLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to see some magic? Give me a phrase");
		String ar[] = sc.nextLine().split(" ");
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			b.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}

		System.out.println("Now your last letters are capitalized! oOooOooOo\n"+b.toString());
	
		
		
		
		
	}


}
