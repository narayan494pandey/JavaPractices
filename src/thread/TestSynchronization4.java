package thread;
class Table4{  
	  
	 synchronized static void printTable4(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	public void run(){  
	Table4.printTable4(1);  
	}  
	}  
	  
	class MyThread2 extends Thread{  
	public void run(){  
	Table4.printTable4(10);  
	}  
	}  
	  
	class MyThread3 extends Thread{  
	public void run(){  
	Table4.printTable4(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThread4 extends Thread{  
	public void run(){  
	Table4.printTable4(1000);  
	}  
	}  
	  
	public class TestSynchronization4{  
	public static void main(String t[]){  
	MyThread1 t1=new MyThread1();  
	MyThread2 t2=new MyThread2();  
	MyThread3 t3=new MyThread3();  
	MyThread4 t4=new MyThread4();  
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	} 
