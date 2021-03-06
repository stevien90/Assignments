package Day3;

import java.util.Scanner;

public class maxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String ar[]= sc.nextLine().split(" ");
		
		String max = ar[0];
		String min = ar[0];
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() > max.length()) {
				max = ar[i];
			}if (ar[i].length()<min.length()) {
				min = ar[i];
			}
		}
		System.out.println(max.toString());
		System.out.println(min.toString());


		
	}
	

}
