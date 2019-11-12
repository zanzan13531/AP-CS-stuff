package BM_array_thingy;

import java.util.*;

public class array_thingy {

	public static void main(String[] args) {
		
		Scanner joe = new Scanner(System.in);
		
		System.out.println("How many interations?");
		
		int loopyness = Integer.parseInt(joe.nextLine());
		
		String[] bob = new String[loopyness];
		
		for (int x = 0; x < loopyness; x++) {
			
			System.out.println("Enter a thingy (" + (x + 1) + "/" + loopyness + "): ");
			bob[x] = joe.nextLine();
			
		}
		
		System.out.println(bob);
		
	}
	
}
