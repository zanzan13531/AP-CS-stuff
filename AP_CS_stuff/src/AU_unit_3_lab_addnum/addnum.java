package AU_unit_3_lab_addnum;

public class addnum {
	
	public static int addNum(int n) {
		
		return(n + 4);
		
	}
	
	public static double addNum(double n) {
		
		return(n + 5);
		
	}
	
	public static String addNum(String n) {
		
		return(n + 6);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(addNum(5));
		System.out.println(addNum(5.5));
		System.out.println(addNum("5.5"));
		
	}
	
}
