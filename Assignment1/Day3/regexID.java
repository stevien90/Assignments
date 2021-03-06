package Day3;

public class regexID {

	public static void main(String[] args) {
		//1) Write validation for passport number, SSN number, DL and any other ID if you have
		
		String passport = "c12312dfs";
		//U.S. Passport numbers must be between six and nine alphanumeric characters (letters and numbers). 
		//The “C” that precedes a U.S. Passport Card number is no longer case sensitive.
		
		if(passport.matches("[a-zA-Z0-9]{6,9}") && (passport.startsWith("c") || passport.startsWith("C"))) {
			System.out.println("Passport Validated");
		}else {
			System.out.println("Passport Invalid");
		}
		
		//SSL 3 digits - 2 digits - 4 digits
		String SSN = "123-16-8423";
		if(SSN.matches("[0-9]{3}"+"-"+"[0-9]{2}"+"-"+"[0-9]{4}")) {
			System.out.println("SSN Validated");
		}else {
			System.out.println("SSN Invalid");
		}
		
		//DL - 8 digits
		String DL = "81247221";
		if(DL.matches("[0-9]{8}")) {
			System.out.println("DL is Validated");
		}else {
			System.out.println("DL is Invalid");
		}
		//Credit Card - 4 digits " " 4 digits " " 4 digits " " digits
		String CC = "1245 3282 3895 8321";
		if(CC.matches("[0-9]{4}"+" "+"[0-9]{4}"+" "+"[0-9]{4}"+" "+"[0-9]{4}")) {
			System.out.println("Credit Card is Validated");
		}else {
			System.out.println("Credit Card is Invalid");
		}
	}

}
