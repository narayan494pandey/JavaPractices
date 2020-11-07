package encapculation;
/* class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
  
public class Simple1{  
 public static void main(String args[]){  
   Simple1 obj=new Simple1();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  */
class A{  
private A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class Simple1{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
} 