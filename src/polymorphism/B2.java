package polymorphism;

/* class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
}

public class B2 extends A {
	B2() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		B2 b = new B2();
	}
} */
class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
}

class B2 extends A {
	B2() {
		super();
		System.out.println("child class constructor invoked");
	}

	B2(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		B2 b1 = new B2();
		B2 b2 = new B2(10);
	}
}