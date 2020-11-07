package over1;

interface printable1 {
	void print();
}

class A12 implements printable1 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		A12 obj = new A12();
		obj.print();
	}
}