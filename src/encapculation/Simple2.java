package encapculation;

class A1 {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class Simple2 extends A1 {
	void msg() {
		System.out.println("Hello java");
	}// C.T.Error

	public static void main(String args[]) {
		Simple2 obj = new Simple2();
		obj.msg();
	}
}