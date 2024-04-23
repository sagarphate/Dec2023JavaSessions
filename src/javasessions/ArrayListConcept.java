package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Array Program
		int a[] = new int [5];
		a[0] = 11;
		a[1] = 21;
		a[2] = 31;
		a[3] = 41;
		a[4] = 51;
		
		// Array Start with Zero and Ends with Size-1(n-1)
		
		for(int i=0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i : a) {
			System.out.println(i);
		}
	
		//// Array Program
		// save heterogeneous data. // It is Static object Array size is fixed but save different type of data
		Object o[] = new Object[3];
		o[0] = "Sagar";
		o[1] = 34;
		o[2] = 'M';
		for(Object d: o) {
			System.out.println(d);
		}
		
		String arr[] = {"PHATE","SAGAR","9096151498","FUJITSU","PUNE"}; // Array literals where size adjust as per declared value
		for(String s: arr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(arr)); // [PHATE, SAGAR, 9096151498, FUJITSU, PUNE]
		
		
		// ArrayList
		// Write a program to create a static Array, having following cricket data:
		
		ArrayList<String> colorli = new ArrayList<String>();
		colorli.add("red");
		colorli.add("white");
		colorli.add("blue");
		colorli.add("orance");
		colorli.add("black");
		
		// retrieve all element from given Array list
		for(String color: colorli) {
			System.out.println(color);
		}		
		
		//Write a Java program to retrieve an element at a specified index from a given array list.
		
		System.out.println(colorli.get(2)); // blue will print
				
		//Write a Java program to update specific array element by given element.
		
		System.out.println("***************");
		colorli.set(2, "Golden");
		for(int i =0; i < colorli.size(); i++) {
			System.out.println(colorli.get(i));
		}
		
		//Write a Java program to remove the third element from an array list. 
		System.out.println("*************");
		colorli.remove(2);
		System.out.println(colorli);
		
		// Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		
		System.out.println("*** SEARCH WHITE color only **");
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("RED");
		colors.add("WHITE");
		colors.add("BLUE");
		colors.add("ORANGE");
		colors.add("BLACK");
		
		
		for(int i=0; i<colors.size(); i++) {
			
			if(colors.get(i).equalsIgnoreCase("white")) {
				System.out.println(colors.get(i));
				break;
			}
		}
		
		System.out.println("***********");
		
		//Reverse this array List:
		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add("sagar");
		studentlist.add("varun");
		studentlist.add("reena");
		studentlist.add("robin");
		studentlist.add("peter");
		studentlist.add("naveen");
		
		
		for(int i = studentlist.size()-1 ; i >=0 ; i--) {
			System.out.println(studentlist.get(i));
		}
		
		
		//Write a Java program to extract a portion of an array list.
		System.out.println("** Print portion Array List **");
		System.out.println( studentlist.subList(2, 5) );
		
		//Write a Java program to empty an array list.
		System.out.println("** Empty Array List **");
		 studentlist.clear();
		 System.out.println(studentlist);
		
		//Write a Java program to trim the virtual capacity of an array list to the current list size.
		 ArrayList<String> al = new ArrayList<String>(10);
		 al.add("sam");
		 al.add("don");
		 al.add("john");
		 al.add("peter");
		 al.add("smith");
		 al.trimToSize(); // by default virtual capacity assign as 10 OR as per mentioned
		 // with help of these method VC trim as per physical capacity size. 
		 System.out.println(al.size());
		 
		 
		 //Write a Java program to print all the elements of an ArrayList using the position of the elements.
		 
		 ArrayList<String> names = new ArrayList<String>();
		 names.add("petar");
		 names.add("jhone");
		 names.add("sam");
		 names.add("smith");
		 names.add("virat");
		 names.add("harsh");
		 names.add("shiv");
		 names.add("aadu");
		 
		 for(int i=0; i<names.size(); i++) {
			System.out.println(i +"  " +names.get(i));
		 }
		 
	}
}
