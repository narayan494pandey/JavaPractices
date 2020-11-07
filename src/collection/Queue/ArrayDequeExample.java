package collection.Queue;
/*
 * ArrayDeque class declaration
 
Let's see the declaration for java.util.ArrayDeque class.

public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable  
Java ArrayDeque Example
*/
import java.util.*;  
public class ArrayDequeExample {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}