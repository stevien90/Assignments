package Day1;

public class OddNumbers {

	public static void main(String[] args) {
	
	// For loop to print out odd numbers between 100 and 199
	for (int i = 100; i < 199; i++) {
		if(i%2 != 0) {
			System.out.println(i);
			
	//Using || to find odd. Longer way but still works
	for (int j = 100; j < 199; j++) {
		if(i%2==1 || i%2==3 || i%2==5 || i%2==7 || i%2==9){
			System.out.println(j);
	}
		}
		
	}

	}
	

}
}