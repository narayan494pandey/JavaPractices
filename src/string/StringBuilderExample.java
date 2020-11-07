package string;

public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
	}

}

//The StringBuilder insert() method inserts the given string with this string at the given position.

/*class StringBuilderExample2{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  
}  
} */


//3) StringBuilder replace() method
/*The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.

class StringBuilderExample3{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  
}  
}  */