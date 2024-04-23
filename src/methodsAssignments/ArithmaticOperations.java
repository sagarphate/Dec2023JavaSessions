package methodsAssignments;

public class ArithmaticOperations {

	public static void main(String[] args) {
	
		ArithmaticOperations art = new ArithmaticOperations();
		
		// to call Non static method have to create the object of the class and call them
		art.addition(10,10);
		art.subtraction(20, 21);
		
		// Static method called with help of the Class Name
		ArithmaticOperations.multiplication(5, 5);
		ArithmaticOperations.division(50, 10);
		
		// Static method present in same class then direct call then with help of the Name
		multiplication(4, 4);
		division(60, 2);
	}

	public void addition(int i, int j) {
		int addition;
		addition = i + j;
		System.out.println("Addtion is : " +addition);
	}
	
	public void subtraction(int i, int j) {
		int substraction;
		substraction = i - j;
		System.out.println("substraction is : "+substraction);
	}
	
	public static void multiplication(int i, int j) {
		int multiplication;
		multiplication = i * j;
		System.out.println("multiplication is : "+multiplication);
	}
	
	public static void division(int i, int j) {
		int division;
		division = i / j ;
		System.out.println("division is : "+division);
	}
}
