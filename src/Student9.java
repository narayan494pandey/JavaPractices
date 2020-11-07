
public class Student9 {
	//Java Program to demonstrate the use of a static method. 
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     //constructor to initialize the variable  
	     Student9(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}   
	//Test class to create and display the values of object 
	    public static void main(String args[]){  
	    Student9.change();//calling change method  
	    //creating objects  
	    Student9 s1 = new Student9(111,"Karan");  
	    Student9 s2 = new Student9(222,"Aryan");  
	    Student9 s3 = new Student9(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
}
