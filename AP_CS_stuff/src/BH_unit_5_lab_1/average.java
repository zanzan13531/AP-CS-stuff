package BH_unit_5_lab_1;

import java.util.*;

public class average {
	
	public static void main(String[] args) {
		
		int newest = 0;
		int sum = 0;
		double stuffs = 0.0;
		
		Scanner bob = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		newest = Integer.parseInt(bob.nextLine());
		stuffs = stuffs + 1;
		
		while (newest != -1) {
			
			sum = sum + newest;
			
			System.out.println("Enter a number:");
			newest = Integer.parseInt(bob.nextLine());
			stuffs = stuffs + 1;
			
		}
		
		stuffs = stuffs - 1;
		System.out.println("Average: " + sum/stuffs);
		
		bob.close();
		
	}	
	
}