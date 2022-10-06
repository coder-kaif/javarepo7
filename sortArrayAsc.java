// Java program to demonstrate
// How to sort ArrayList in ascending order

import java.util.*;

public class sortArrayAsc {
	public static void main(String args[])
	{

		// Get the ArrayList
		ArrayList<String>
			list = new ArrayList<String>();

		// Populate the ArrayList
		list.add("Zain");
		list.add("Khan");
		list.add("ZainKhan");
		list.add("ZainKhanZain");
		list.add("A computer portal");

		// Print the unsorted ArrayList
		System.out.println("Unsorted ArrayList: "+ list);
                
		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);

		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList "+ "in Ascending order : "+ list);
	}
}
