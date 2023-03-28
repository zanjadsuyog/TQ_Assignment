package Containment;

public class Employee {

	int eid;
	String dname;
	int salary;
	Mydate date;
	JoinningDate dept;

	
	public Employee()
	{
		
	}
	public Employee(int eid, String dname, int salary, Mydate date, JoinningDate dept) {
		super();
		this.eid = eid;
		this.dname = dname;
		this.salary = salary;
		this.date = date;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Mydate getDate() {
		return date;
	}
	public void setDate(Mydate date) {
		this.date = date;
	}
	public JoinningDate getDept() {
		return dept;
	}
	public void setDept(JoinningDate dept) {
		this.dept = dept;
	}
	

}
