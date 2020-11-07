package exception;

/* public class TryCatchExample1 {
	public static void main(String[] args) {

		int data = 50 / 0; // may throw exception

		System.out.println("rest of the code"); // all the line after exception not execute

	}

}*/

/* public class TryCatchExample1 {  
	  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
} */
/* public class TryCatchExample1 {

	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
								// if exception occurs, the remaining statement will not exceute
			System.out.println("rest of the code");
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}*/
public class TryCatchExample1 {

	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the exception by using Exception class
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
