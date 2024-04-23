package methodsAssignments;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 

		try (Scanner sc = new Scanner(System.in)) {
			double r = sc.nextDouble();
			
			Circle cr = new Circle();
			cr.circumference(3.14, r);
			cr.areaOfCircle(3.14, r);
		}
	}

	public void circumference(double pi, double r) {
		//C=2πr
		
		double circumference;
		circumference = 2 * pi * r ;
		System.out.println("circumference is : "+circumference);
		
	}
	
	public void areaOfCircle(double pi, double r) {
		//A=πr2
		
		double area;
		area = pi * Math.pow(r,2);
		System.out.println("area is : "+area);
		
	}
}
