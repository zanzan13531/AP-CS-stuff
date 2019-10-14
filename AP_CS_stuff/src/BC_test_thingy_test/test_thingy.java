package BC_test_thingy_test;

public class test_thingy {
	
	public static void main(String[] args) {
		numberTriangle(5);
		
	}
	
	public static void numberTriangle(int height) {
		for (int x = 0; x < height; x++) {
			
			for (int y = 0; y < height-x;y++) {
				
				System.out.print((height-x) *(y+1)+" ");
			}
			System.out.println();
		}
	}
	
	
}
