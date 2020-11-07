package string;

//Java Program to demonstrate the use of StringBuffer class.  
public class BufferTest {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("hello");
		buffer.append("java");
		System.out.println(buffer);
	}
}
/*
// Java Program to demonstrate the use of StringBuilder class.
public class BuilderTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hello");
		builder.append("java");
		System.out.println(builder);
	}
}
*/