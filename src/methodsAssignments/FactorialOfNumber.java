package methodsAssignments;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		FactorialOfNumber fact = new FactorialOfNumber();
		fact.numberFactorial(5);

	}

	public void numberFactorial(int num) {
		
		int fact = 1;
		for(int i=1; i <= num; i++) {
			
			fact = fact * i;
		}
		System.out.println("Factorial of number is = " +fact); 
	}
}
