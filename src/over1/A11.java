package over1;
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A11 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A11 obj = new A11();  
obj.print();  
obj.show();  
 }  
}  