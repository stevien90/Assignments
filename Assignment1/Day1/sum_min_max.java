package Day1;

public class sum_min_max {

	public static void main(String[] args) {
	
		//* 4)Find the sum of all even numbers between 1 and 100, also find sum of all odd numbers between 1 and 100
		//and print the results and print which is largest among them(between evensum and oddsum)
		int totaleven = 0;
		int totalodd =0;
		
		//Summing up all the even numbers and odd numbers
		for (int x = 1; x < 100; ++x) {
			if(x%2==0) {
				totaleven+=x;
			}if(x%2==1) {
				totalodd+=x;
			}
			
		}
			//Printing out the total sum of the odd numbers and the total sum of the even numbers
			System.out.println("The sum of all even numbers between 1 and 100 is "+ totaleven);
			System.out.println("The sum of all odd numbers between 1 and 100 is "+ totalodd);
			
			//Comparing the sums to see which one is larger
			if(totaleven>totalodd) {
				System.out.println("sum of even"+ totaleven+" is the bigger number");
			}if(totalodd>totaleven){
				System.out.println("sum of odd "+ totalodd+" is the bigger number");
			}else {
				System.out.println("Both numbers are the same");
			}
				
		
	}

}
