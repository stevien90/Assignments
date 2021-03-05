package Day2;

import java.util.Arrays;

public class CRUD {

	public static void main(String[] args) {
		
		//Create
		int rectangle[] = new int [7];
		rectangle[0] = 1;
		rectangle[1] = 5;
		rectangle[2] = 4;
		rectangle[3] = 12;
		rectangle[4] = 123;
		int elements = 5;
		
		//Read
		for (int i = 0; i < rectangle.length; i++) {
			System.out.println(rectangle[i]);
		}
		//Arrays.sort(rectangle);
		System.out.println(Arrays.toString(rectangle));
		
		//Update
		int newNumber = 24;
		int spot = 3;
		for (int i = elements; i > spot-1; i--) {
			rectangle[i] = rectangle[i-1];
		}
		rectangle[spot-1] = newNumber;
		elements++;
		
		System.out.println("After updating: ");
		System.out.println(Arrays.toString(rectangle));
		
		// Delete
		int delete = 4;
		for (int i = delete-1; i < elements ; i++) {
			rectangle[i] = rectangle[i+1];
			
		}
		System.out.println("After deleting");
		System.out.println(Arrays.toString(rectangle));
		elements--;

	}

	
}
