package Employee;

import java.util.Arrays;
	public class Esalary {
		public static void main(String[] args) {
			Employee[] employees = new Employee[5];
			
			employees[0]= new Employee(101, "John", 5000);
			employees[1]= new Employee(101, "John", 5000);
			employees[2]= new Employee(101, "John", 5000);
			employees[3]= new Employee(101, "John", 5000);
			employees[4]= new Employee(101, "John", 5000);
			

		double[] salaries = new double[employees.length];for(
		int i = 0;i<employees.length;i++)
		{
			salaries[i] = employees[i].salary;
		}salaries=Arrays.stream(salaries).distinct().toArray();

		for(double salary:salaries)
		{
			System.out.println("Employees with salary " + salary + ":");
			for (Employee employee : employees) {
				if (employee.salary == salary) {
					System.out.println(employee.id + "\t" + employee.name);
				}
			}
		}
	}

}
