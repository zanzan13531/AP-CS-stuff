package AT_unit_3_homework_3_2_exersize_3_9;

public class lastdigit {
	
	public static int lastDigit(int n) {
	    
	    return (Math.abs(n % 10));
	    
	}
	
	public static void main(String[] args){
		
		System.out.println(lastDigit(3572));
		System.out.println(lastDigit(-947));
		System.out.println(lastDigit(6));
		System.out.println(lastDigit(35));
		System.out.println(lastDigit(123456));
		System.out.println(lastDigit(123123));
		
	}
	
}
