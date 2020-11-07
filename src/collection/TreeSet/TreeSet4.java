package collection.TreeSet;
import java.util.*; 
public class TreeSet4 {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial Set: " + set);

		System.out.println("Reverse Set: " + set.descendingSet());

		System.out.println("Head Set: " + set.headSet("C", true));

		System.out.println("SubSet: " + set.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set.tailSet("C", false));
	}

}
/*
 * import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println("Intial Set: "+set);  
           
         System.out.println("Head Set: "+set.headSet("C"));  
          
         System.out.println("SubSet: "+set.subSet("A", "E"));  
           
         System.out.println("TailSet: "+set.tailSet("C"));  
 }  
}
Output:

Intial Set: [A, B, C, D, E]
Head Set: [A, B]
SubSet: [A, B, C, D]
TailSet: [C, D, E]  
 */
