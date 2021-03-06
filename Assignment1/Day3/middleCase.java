package Day3;

import java.util.Scanner;

public class middleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String ar[] = sent.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].length()%2==1) { // odd
				sb.append(ar[i].substring(0,ar[i].length()/2));
				sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()/2)));
				sb.append(ar[i].substring(ar[i].length()/2+1, ar[i].length())).append(" ");
			}if(ar[i].length()%2==0) {//even
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
			
	
			
		}
		System.out.println(sb.toString().trim());
	/// dont know how to fix the error but Im sure the answer is close to this
		//sb.append(sb.substring(0,(ar[i].length()/2)));
	}

}
