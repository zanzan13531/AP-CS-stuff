package AK_unit_2_lab_2;

public class countdown_with_sum {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 100; i > 0; i = i - 1) {
			
			sum = sum + i;
			System.out.print(i + " ");
			
		}
		
		System.out.println(sum);
		
	}
	
}