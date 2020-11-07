package syncronization;

//example of java synchronized method  
class Table1 {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread4 extends Thread {
	Table t;

	MyThread4(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread3 extends Thread {
	Table t;

	MyThread3(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization2 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread4 t1 = new MyThread4(obj);
		MyThread3 t2 = new MyThread3(obj);
		t1.start();
		t2.start();
	}
}
