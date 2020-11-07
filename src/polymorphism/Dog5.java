package polymorphism;

/* class Dog {
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.eat();
	}
} */
class Animal4 {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog5 extends Animal4 {
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Animal4 a = new Dog5();
		a.eat();
	}
}
