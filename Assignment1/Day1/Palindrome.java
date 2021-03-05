package Day1;

public class Palindrome {

	public static void main(String[] args) {
	
	//Testing out the Palindrome methhod
	isPalindrome(1214123);
	
	//Using Palindrome method to check numbers between 100 and 999
	for(int p=100; p<999; p++){
		isPalindrome(p);
	}


	}
	//Reversing the number method
	public static int Reverse(int n){
		int result=0;
		for (int i = n; i > 0; i/=10) {
			result = result *10 + i%10;
		
		}
		return result;	
		}
	
	//Creating palindrome method
	public static void isPalindrome(int i) {
		if(Reverse(i)==i) {
			System.out.print(i+" ");
			
		}
		
		
	}
	
	}


