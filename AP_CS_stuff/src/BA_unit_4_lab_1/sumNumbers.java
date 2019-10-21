package BA_unit_4_lab_1;

import java.util.*;

public class sumNumbers {

	public static void main(String[] args){
		
		Scanner a = new Scanner(System.in);
		System.out.println("low?");
		String b = a.nextLine();
		System.out.println("high?");
		String c = a.nextLine();
		
		int d = Integer.parseInt(b);
		int e = Integer.parseInt(c);
		
		int f = 0;
		for (int x = d; x <= e; x++){
			
			f = f + x;
			
		}
		
		System.out.print("sum = " + f);
		
		a.close();
		
	}
	
}
