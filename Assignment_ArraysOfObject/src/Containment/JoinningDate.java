package Containment;

public class JoinningDate {

/*	Create class Dept(did, dname), class MyDate(day, month, year)
	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
	Create array of Employee and display the array elements.
*/
	
	private int did;
	private String dname;
	
	
	public JoinningDate()
	{
		
	}
	public JoinningDate(int did,String dnam)
	{
		this.did=did;
		this.dname=dnam;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
}
