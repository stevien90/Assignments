package Day4;
//business layer
public class PassportDLlogic{

	//U.S. Passport numbers must be between six and nine alphanumeric characters (letters and numbers). 
	//The “C” that precedes a U.S. Passport Card number is no longer case sensitive.
	
	//CHECKED EXCEPTION - forces the developer to make a try and catch before the program can run
	public boolean isPassport(String p) throws InvalidPassportException {
		if(p.matches("[^a-zA-Z0-9]{1,9}")) {
			throw new InvalidPassportException("No special characters");
		}if(!(p.startsWith("c") || p.startsWith("C"))) {
			throw new InvalidPassportException("Must contain c or C in the front");
		}if(!(p.length()==6 || p.length()== 9)) {
			throw new InvalidPassportException("The amount of characters does not suffice");
		}
		return true;
	}
	//DL - 8 digits
	
	//UNCHECKED - meaning the developer can use this method without correcting the error, the error 
	//message bellow will appear when the program is running
	public boolean isDLvalid(String d) {
		if(d.matches("[^0-9]{1,8}")) {
			throw new InvalidDLexception("Please enter numbers only");
		}if(!(d.length()== 8)) {
			throw new InvalidDLexception("Invalid amount of numbers");
		}
		return true;
	}
	

}
