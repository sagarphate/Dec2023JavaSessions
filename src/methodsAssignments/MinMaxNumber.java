package methodsAssignments;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			minimum(a, b, c);
			maximum(a, b, c);
		}
	}
	
	public static void minimum(int i, int j , int k) {
		
		if(i<j && i<k ) {
			System.out.println("Minimum Number is : " +i);
		}
		else if(j<i && j<k) {
			System.out.println("Minimum Number is : " +j);
		}
		else {
			System.out.println("Minimum Number is : " +k);
		}
			
	}
	
	public static void maximum(int i, int j, int k) {
		
		if(i>j && i>k ) {
			System.out.println("Maximum Number is : " +i);
		}
		else if(j>i && j>k) {
			System.out.println("Maximum Number is : " +j);
		}
		else {
			System.out.println("Maximum Number is : " +k);
		}
		
	}

}
