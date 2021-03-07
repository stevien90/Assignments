package Day4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Business {
	//Checked exception...using Java known FileNotFoundException
	public void readFile(String file) throws FileNotFoundException {
		FileOutputStream read = new FileOutputStream(file);

	}
	
	//Checked exception using a newly created exception object from parent Exception
	public boolean validHeight(int height) throws InvalidHeightException {
		if(height <= 4) {
			throw new InvalidHeightException("Too short to ride");
		}
		if(height > 6 ){
			throw new InvalidHeightException("Too tall to ride");
		}
		return true;
	}
	//Unchecked exception using newly created exception object form parent Runtime
	public boolean validFingers(int fingers) {
		if(!(fingers == 10)) {
			throw new InvalidFingerException("The amount of " + fingers + " fingers is inhumane");
		}
		return true;
	}
	

}
