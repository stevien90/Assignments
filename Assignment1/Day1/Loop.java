package Day1;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		
		//Numbers that ends with 8 between 88 and 888
		//For Loop
		for(int x = 88; x<=888; x++) {
			if(x%10==8) {
				System.out.println("x is "+x);
			}
		}

		System.out.println();
		
		//While Loop
		int count = 0;
		int x = 4;
		int y = 1000;
		while(y>0) {
			y = y/x;
			count++;
		}
		System.out.println("You can divide 1000 by 4 for about "+count+" times until it becomes negative");
		System.out.println();
		
		//Do While
		Scanner sc=new Scanner(System.in);
		
		int s = 1;
		
		do {
			System.out.println("Here is a list of service we have:");
			System.out.println("1. Pat your head");
			System.out.println("2. Lap Pillow");
			System.out.println("3. uWu");
			System.out.println("Please enter the number for the service of your choice");
			System.out.println("Or enter the number 0 if you would like to exit");
			s = Integer.parseInt(sc.nextLine());
		}while(s!=0);
		
	}

}
