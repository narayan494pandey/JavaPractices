package string;

/* import java.util.StringTokenizer;

public class Simple {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is ram", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
} */
import java.util.*;

public class Simple {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,ram");

		// printing next token
		System.out.println("Next token is : " + st.nextToken(","));
	}
}