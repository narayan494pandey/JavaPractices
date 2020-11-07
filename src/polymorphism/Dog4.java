package polymorphism;

class Animal2 {
}

class Dog4 extends Animal2 {
	static void method(Animal2 a) {
		Dog4 d = (Dog4) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Animal2 a = new Dog4();
		Dog4.method(a);
	}
}