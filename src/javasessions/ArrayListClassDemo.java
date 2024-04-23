package javasessions;

import java.util.ArrayList;

public class ArrayListClassDemo {

	public static void main(String[] args) {
		
		// below is the row type - Any kind of data can add in these ArrayList
		// this is not a good practice 
		ArrayList arr = new ArrayList();
		arr.add(100); 
		arr.add(100);
		arr.add("sagar");
		arr.add(12.22);
		arr.add('j');
		arr.add(true);
		System.out.println(arr);
		
		// Generic can not be primitive data types it should be Integer
		// both side same Generic use - otherwise it give error
		// if we declare the Integer type Array List then it store the ONLY integer data type values
		// Array list Allowed Duplicate Values
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(80);
		markList.add(56);
		
		ArrayList<String> productList = new ArrayList<String>(); // It store only String 
		productList.add("mackbook");
		
		// this is Arraylist of Object type then it store multiple Data Type Values
		ArrayList<Object> empList = new ArrayList<Object>();
		empList.add("sagar");
		empList.add(100);
		empList.add(12.220);
		empList.add('M');
		empList.add(true);
		empList.add(null);
		
		System.out.println("****** Employee Details Print with FOR Loop as below = *******");
		for(int i=0; i<empList.size(); i++)
		{
			System.out.println(empList.get(i));
		}
		
		System.out.println("******* Direct Print the Array List Object ********");
		System.out.println(empList);
		
		
		
		
	}
}
