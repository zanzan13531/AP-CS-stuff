package AN_unit_2_homework_2_3_exersize_2_20;

public class starfigure {
	
	public static void printify(int repeat, String character) {
		
		for (int z = 0; z < repeat; z++) {
			
			System.out.print(character);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			printify((4-i)*4, "/");
			printify((i)*8, "*");
			printify((4-i)*4, "\\");
			
			System.out.println();
			
		}
		
	}
	
}
