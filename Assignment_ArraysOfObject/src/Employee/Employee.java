package Employee;

public class Employee {

	
/*	WAP to print the employees from Employee[] array who has same salary 
 * (Create Employee class which has 3 attributes id, name, salary and
 *  add employee objects to your array)
 */
	int id;
	String name;
	double salary;
	
	void Employee()
	{
		
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
