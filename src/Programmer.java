class Employee {
	float salary = 40000;
}

public class Programmer extends Employee {
	int bonus = 10000;
	float salary = 30000;

	public static void main(String args[]) {
		Employee p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		// System.out.println("Bonus of Programmer is:" + p.bonus);
	}

}
