package Day4;

import java.util.Scanner;

public class PassportDLmain {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	PassportDLlogic pd = new PassportDLlogic();
	
	System.out.println("Please enter your passport number");
	String userInput = sc.nextLine();
	
	
	try {
		if(pd.isPassport(userInput)) {
		System.out.println("Validation successful");	
		}
	}catch(InvalidPassportException e){
		System.out.println(e.getMessage());
	}
	
	
	
	System.out.println("Please enter your Driver's License number");
	String userInput2 = sc.nextLine();
	if(pd.isDLvalid(userInput2)) {
		System.out.println("Validation completed");
	}
	

}
}