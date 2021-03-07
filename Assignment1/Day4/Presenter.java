package Day4;

public class Presenter {
	//activating business layers methods and creating try/catch
	public static void main(String[] args) {
		Business b = new Business();
		
	try {
		if (b.validHeight(5)){
		System.out.println("Please enjoy your ride");
		}
	} catch (InvalidHeightException e) {
		System.out.println(e.getMessage());
	}

	//unchecked exception without fixing the problem
	if (b.validFingers(10)) {
		System.out.println("You are qualified as a human");
	}
	
	//fixing the problem with try/catch
	try {
		if(b.validFingers(120)) {
		System.out.println("You are qualified as a human");
		}
	}catch(InvalidFingerException e) {
		System.out.println("Please enter 10 if you want to pretend to be a human");
		
	}
	}

}
