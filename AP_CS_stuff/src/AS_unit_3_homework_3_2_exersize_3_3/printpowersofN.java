package AS_unit_3_homework_3_2_exersize_3_3;

public class printpowersofN {
	
	public static void printPowersOfN(int n1, int n2) {
	    
	    for (int i = 0; i < (n2 + 1); i++) {
	        
	        System.out.print((int) (Math.pow(n1, i)) + " ");
	        
	    }
	    
	}
	
	public static void main(String[] args) {
		
		printPowersOfN(4,3);
		System.out.println();
		printPowersOfN(5, 6);
		System.out.println();
		printPowersOfN(-2, 8);
		
	}
	
}
