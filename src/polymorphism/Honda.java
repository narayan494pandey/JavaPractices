package polymorphism;

/* class Bike{  
	  final void run(){System.out.println("running");}  
	}  
	     
	public class Honda extends Bike{  
	   void run(){
		   System.out.println("running safely with 100kmph");
	   }  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	} */
/*final class Bike {
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
} */
class Bike {
	final void run() {
		System.out.println("running...");
	}
}

class Honda extends Bike {
	public static void main(String args[]) {
		new Honda().run();
	}
}
