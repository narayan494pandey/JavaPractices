package exception;

public class TestFinallyBlock1 {
	public static void main(String args[]) {
		try {
			int data = 25 / 0; // exception occurs and not handled.
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
