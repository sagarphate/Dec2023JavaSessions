package methodsAssignments;

public class EnvenOddNumber {

	public static void main(String[] args) {
		
		boolean result = evenOddNumber(9);

		if(result == true) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
	public static boolean evenOddNumber(int i) {
		
		boolean flag;
		
		if(i%2 == 0) {
			flag = true;
		}
		else {
			flag=false;
		}
			
		return flag;
	} 

}
