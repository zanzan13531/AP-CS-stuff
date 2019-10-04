package BB_unit_4_lab_scanner;

import java.util.*;

public class helloInput {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("What's your name? ");
		String b = a.nextLine();
		System.out.print("What's your age? ");
		String c = a.nextLine();
		System.out.println("Hi " + b + " you are " + c + " years old. Please be safe online and don't disclose your name and age online.");
		
	}
	
}
