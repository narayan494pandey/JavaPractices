package exception;

import java.io.*;

class N1 {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

public class TestThrows3 {
	public static void main(String args[]) throws IOException {// declare exception
		N1 m = new N1();
		m.method();

		System.out.println("normal flow...");
	}
}
