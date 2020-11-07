public class Student8 {
	//Java Program to demonstrate the use of static variable  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Student8(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}    
	//Test class to show the values of objects   
	 public static void main(String args[]){  
	 Student8 s1 = new Student8(111,"Karan");  
	 Student8 s2 = new Student8(222,"Aryan");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
	 }   
}
