package Containment;

public class EmployeeTest {

	public static void display(Employee employee[]) {
		for (Employee emp : employee) {
			System.out.println("ID: " + emp.eid);
			System.out.println("Name: " + emp.dname);
			System.out.println("Salary: " + emp.salary);
			System.out.println(
					"Joining Date: " + emp.date.day + "-" + emp.date.month + "-" + emp.date.year);
			System.out.println("Department ID: " + emp.dept);
			System.out.println("Department Name: " + emp.dname);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		JoinningDate d1 = new JoinningDate(10, "CS");
		JoinningDate d2 = new JoinningDate(20, "Math");

		Mydate m1 = new Mydate(10, "march", 2023);
		Mydate m2 = new Mydate(22, "May", 2024);

		Employee[] employees = { new Employee(1, "omkar", 20000, m1, d1),
				new Employee(2, "Suyog", 78943, m2, d2),
				new Employee(1, "Pritish", 30000, m1, d1),
				new Employee(3, "Vivek", 78000, m2, d2),

		};
		
		display(employees);

		/*
		 * for (Employee employee : employees) { System.out.println("ID: " +
		 * employee.eid); System.out.println("Name: " + employee.dname);
		 * System.out.println("Salary: " + employee.salary); System.out.println(
		 * "Joining Date: " + employee.date.day + "-" + employee.date.month + "-" +
		 * employee.date.year); System.out.println("Department ID: " + employee.dept);
		 * System.out.println("Department Name: " + employee.dname);
		 * System.out.println(); }
		 */
	}

}
