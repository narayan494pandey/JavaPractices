package exception;

import java.io.*;

class P {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare exception
		P m = new P();
		m.method();

		System.out.println("normal flow...");
	}
}
