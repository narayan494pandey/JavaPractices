package thread;

class Simple1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
}

class Simple2 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}

public class TestMultitasking3 {
	public static void main(String args[]) {
		Simple1 t1 = new Simple1();
		Simple2 t2 = new Simple2();

		t1.start();
		t2.start();
		}
}
/*
 * Same example as above by annonymous class that extends Thread class:
Program of performing two tasks by two threads
class TestMultitasking4{  
 public static void main(String args[]){  
  Thread t1=new Thread(){  
    public void run(){  
      System.out.println("task one");  
    }  
  };  
  Thread t2=new Thread(){  
    public void run(){  
      System.out.println("task two");  
    }  
  };  
  
  
  t1.start();  
  t2.start();  
 }  
}  
 */