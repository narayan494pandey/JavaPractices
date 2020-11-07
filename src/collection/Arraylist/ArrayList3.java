package collection.Arraylist;
//Iterating Collection through the for-each loop

// Let's see an example to traverse the ArrayList elements using the for-each loop

import java.util.*;

class ArrayList3 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Traversing list through for-each loop
		for (String obj : al)
			System.out.println(obj);
	}
}
