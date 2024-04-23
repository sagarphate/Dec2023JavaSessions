package methodsAssignments;
import java.util.Scanner;

public class ReturnProductOfNumbers {

	public static void main(String[] args) {
		
		ReturnProductOfNumbers re = new ReturnProductOfNumbers();
		
		try (Scanner sc = new Scanner(System.in)) {
			double d = sc.nextDouble();
			double g = sc.nextDouble();
			double result = re.productNumbers(d,g);
			System.out.println(result);
		}
	}
	
	public double productNumbers(double i, double j) {
		
		double product;
		product = i * j ;
		return product;
	}

}
