package exception;

public class TestFinallyBlock2 {
	public static void main(String args[]) {
		try {
			int data = 25 / 0; // exception occurs and handled.
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
