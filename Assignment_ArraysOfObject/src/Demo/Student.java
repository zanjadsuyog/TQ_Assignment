package Demo;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private float marks;
	private Course cid[];

	public Student() 
	{
		
	}

	public Student(int id, String name, float marks, Course[] cid) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.cid = cid;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Course[] getCid() {
		return cid;
	}

	public void setCid(Course[] cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", cid=" + Arrays.toString(cid) + "]";
	}
	
	
	
	

}
