package collection.Arraylist;
//Iterating Collection through Iterator interface

//Let's see an example to traverse ArrayList elements using the Iterator interface.

import java.util.*;

class ArrayList2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
