package javasessions;

import java.util.Arrays;

public class ArraysConcepts {

	public static void main(String[] args) {
		
				// WAP to delete a specific number from the given array.
				int p[] = {1,4,5,2,3,22,31,2};
				int q[] = new int[p.length-1];
				
				int j=0;
				for(int i=0; i<p.length; i++){
					if(p[i] !=22) {
						q[j] = p[i];
						j++;
					}
				}
				System.out.println(Arrays.toString(q));
				
				
				// Write a program to create a static Array, having following cricket data:
				

	}

}
